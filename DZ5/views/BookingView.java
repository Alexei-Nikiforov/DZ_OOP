package DZ5.views;

import DZ5.models.Table;
import DZ5.presenters.View;
import DZ5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationId, int numberTable) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован. Номер брони: #%d. Номер столика %d.\n", reservationId, numberTable);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }


    @Override
    public void updateShowReservationTableResult(int newReservationId, int newNumberTable) {
        if (newReservationId > 0){
            System.out.printf("Столик успешно перебронирован. Новый номер брони: #%d. Новый номер столика %d.\n", newReservationId, newNumberTable);
        }
        else {
            System.out.println("Не удалось перебронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * TODO: Реализовать в рамках домашней работы
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика, забронировать на другое время
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
