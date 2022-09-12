public class Main {
    public static void main(String[] args) {
var timeWorkPeople = 640;
var timeWorkOnePeople = 8;
var workers = timeWorkPeople / timeWorkOnePeople;
        System.out.println("Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        var officeHoursPeople = workers * timeWorkOnePeople;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + officeHoursPeople + " часов работы может быть поделено между сотрудниками");
    }
}