package DZ5.presenters;

import DZ5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     * @param numberTable номер столика
     */
    void showReservationTableResult(int reservationId, int numberTable);

    /**
     * Отобразить результат перебронирования столика
     * @param reservationId номер брони
     * @param numberTable номер столика
     */
    void updateShowReservationTableResult(int reservationId, int numberTable);

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    /**
     * Установить наблюдателя для представления
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Действие клиента (пользователь нажал на кнопку отмена бронирования), отмена резерва столика, бронирование столика на другое время
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * 
     */
    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
