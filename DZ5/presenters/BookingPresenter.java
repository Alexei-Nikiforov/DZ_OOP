package DZ5.presenters;

import DZ5.models.Table;
import DZ5.models.TableModel;
import DZ5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    private Collection<Table> loadTables(){
        return model.loadTables();
    }

    /**
     * Отобразить список столиков
     */
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    /**
     * Отобразить результат бронирования на представлении
     * @param reservationId результат бронирования
     */
    private void updateUIShowReservationResult(int reservationId, int numberTable){
        view.showReservationTableResult(reservationId, numberTable);
    }

    /**
     * Отобразить результат перебронирования на представлении
     * @param reservationId номер брони
     * @param numberTable номер столика
     */
    private void chowReservationTableResult(int reservationId, int numberTable){
        view.updateShowReservationTableResult(reservationId, numberTable);
    }


    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo, tableNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1, tableNo);
        }
    }

    /**
     * Произошло событие, пользователь нажал на кнопку отмены резерва столика
     * @param oldReservation старый номер брони
     * @param reservationDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            int newReservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
            chowReservationTableResult(newReservationNo, tableNo);
        }
        catch (RuntimeException e){
            chowReservationTableResult(-1, tableNo);
        }
        
    }

}
