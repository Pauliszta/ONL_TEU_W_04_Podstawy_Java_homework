import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pizza {
    public void order() {

//        kwota zamówienia na początku równa 0
        int orderSum = 0;

//        cennik za rozmiar pizzy
        HashMap <String, Integer> priceList = new HashMap<>();
        priceList.put("S", 25);
        priceList.put("M", 30);
        priceList.put("L", 35);
        priceList.put("XL", 40);

//        cennik za dodatki
        HashMap <String, Integer> possibleAdds = new HashMap<>();
        possibleAdds.put("ser", 5);
        possibleAdds.put("pomidor", 3);
        possibleAdds.put("szynka", 5);

//        wprowadzenie dla klienta
        System.out.println("Witamy! Ponizej nasze menu:");
        Set<Map.Entry<String, Integer>> entries= priceList.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println("Pizza " + entry.getKey() + " - " + entry.getValue() + "zł");
        }
//          zapytanie o ilość pizz - jak długo pętla ma się wykonywać
        System.out.println("Podaj ile pizz zamawiasz: ");
        Scanner s = new Scanner(System.in);
        int pizzasQuantity = s.nextInt();

//      pętla dla każdej z pizz
        for (int i=0; i < pizzasQuantity; i++) {
            System.out.println("Podaj rozmiar pizzy nr " + (i+1) + ":");
            Scanner p1 = new Scanner(System.in);
            String order = p1.nextLine();
//            dodanie kwoty za pizze do sumy
            orderSum += priceList.get(order);
//            pytanie o dodatki
            System.out.println("Czy chcesz dodać dodatki do pizzy: (tak/nie)");
            Scanner a1 = new Scanner(System.in);
            String adds = a1.nextLine();
//          jeśli dodatki true to wpisz dodatki
            if (adds.equalsIgnoreCase("tak")) {
                Set<Map.Entry<String, Integer>> entries2= possibleAdds.entrySet();
                for(Map.Entry<String, Integer> entry : entries2) {
                    System.out.println("Dodatek " + entry.getKey() + " - " + entry.getValue() + "zł");
                }
//          zapytanie o dodatek
                System.out.println("Podaj nazwe dodatku: ");
                Scanner a2 = new Scanner(System.in);
                String add = a2.nextLine().toLowerCase();
//          doliczenie dodatku do kwoty łącznej zamówienia
                orderSum += possibleAdds.get(add);
            }
        }

//      wypisanie kwoty całkowitej do zapłaty
        System.out.println("Kwota do zapłaty to: " + orderSum);

    }
}
