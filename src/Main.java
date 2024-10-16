
class Employee{
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private int wiek;
    private String email;

    public Employee(String imie, String nazwisko, String stanowisko, int wiek, String email){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
        this.email = email;
    }
    public void logowanie(){
        System.out.println("zalogowano");
    }
    public void praca(){
        System.out.println("pracownik pracuje");
    }
    public void koniecpracy(){
        System.out.println("pracownik zakończył prace");
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getStanowisko(){
        return stanowisko;
    }

    public int getWiek(){
        return wiek;
    }

    public String getEmail(){
        return email;
    }


}
class Manager extends Employee{
    int dzial;
    int podwladni;
    boolean statusLogowania;

    public Manager(String imie, String nazwisko, String stanowisko, int wiek, String email, int dzial, int podwladni, boolean statusLogowania) {
        super(imie, nazwisko, stanowisko, wiek, email);

    }
    public void przydzielenieZadania(){
        System.out.println("przydzielono zadanie");
    }
    public void przegladRaportow(){
        System.out.println("przegladanie raportow");
    }

    public void wyswietlanieDanych(){
        System.out.println("Wyswietlono dane");
    }

    public int getDzial(){
        return dzial;
    }

    public int getPodwladni(){
        return podwladni;
    }

    public boolean StatusLogowania(){
        return statusLogowania;
    }

}

public class Main {
    public static void main(String[] args) {
    Manager Krzysztof = new Manager("Krzysztof", "Kozak", "menadzer", 30, "kozak@email.com", 0, 0, true);
        System.out.println(Krzysztof.getImie());
        System.out.println(Krzysztof.getNazwisko());
        System.out.println(Krzysztof.getStanowisko());
        System.out.println(Krzysztof.getWiek());
        System.out.println(Krzysztof.getEmail());
        System.out.println(Krzysztof.getDzial());
        System.out.println(Krzysztof.getPodwladni());
        System.out.println(Krzysztof.statusLogowania);
    }
}