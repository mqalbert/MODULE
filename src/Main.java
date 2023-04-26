import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db=new DbFunctions();
        //подключился к своей базе данных
        Connection conn=db.connect_to_db("mod1.2","postgres","aboxamk12");

        //НИЖЕ Я СОЗДАЮ ТАБЛИЦУ В БАЗЕ ДАННЫХ С ИМЕНЕМ ТРЕЙДЕР2
        db.createTable(conn,"Trader2");

        //ТУТ Я ЗАПОЛНЯЮ ТАБЛИЦУ ДАННЫМИ
        //db.insert_row(conn,"Trader2","Albert","Kharkov","7000","EURUSD");
        //db.insert_row(conn,"Trader2","Kolya","Mexico","4000","GBPUSD");
        //db.insert_row(conn,"Trader2","Max","Odessa","6000","XAUUSD");

        //ОБНОВЛЯЮ ДАННЫЕ ПО ИМЕНИ
        //db.update_name(conn,"trader2","Max","Ihor");

        //УДАЛИТЬ ДАННЫЕ ПО ИМЕНИ
        //db.delete_row_by_name(conn,"trader2","Ihor");

        //УДАЛИТЬ ДАННЫЕ ПО АЙДИ
        //db.delete_row_by_id(conn,"employee",5);

        //УДАЛИТЬ ВСЮ ТАБЛИЦУ
        //db.delete_table(conn,"trader2");

        //ВЫВОД ДАННЫХ
        db.read_data(conn,"trader2");

    }
}