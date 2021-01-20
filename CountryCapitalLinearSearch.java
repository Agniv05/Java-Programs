import java.util.*;
public class CountryCapitalLinearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String country[]={"United Arab Emirates","Nigeria","Ghana","Pitcairn Islands","Ethiopia","Algeria",
            "Niue","Jordan","Netherlands","Andorra","Turkey","Madagascar","Samoa","Turkmenistan","Eritrea",
            "Kazakhstan","Paraguay","Greece","Cook Islands","Iraq","Azerbaijan","Mali","Brunei",
            "Thailand","Central African Republic","Gambia","Saint Kitts and Nevis","China",
            "Lebanon","Serbia","Belize","Germany","Switzerland","Kyrgyzstan",
            "Guinea-Bissau","Colombia","Brazil","Slovakia","Republic of the Congo","Barbados","Belgium"};
        String capital[]={"Abu Dhabi", "Abuja", "Accra", "Adamstown", "Addis Ababa", "Algiers", "Alofi", 
            "Amman", "Amsterdam", "Andorra la Vella", "Ankara", "Antananarivo", "Apia", "Ashgabat", "Asmara", 
            "Astana", "Asunción", "Athens", "Avarua", "Baghdad","Baku", "Bamako", "Bandar Seri Begawan", "Bangkok",
            "Bangui", "Banjul", "Basseterre", "Beijing", "Beirut", "Belgrade", "Belmopan", "Berlin", "Bern",
            "Bishkek", "Bissau", "Bogotá", "Brasília", "Bratislava", "Brazzaville", "Bridgetown", "Brussels"};
        String capitalEntry;
        int l=country.length;
        int r, noOfChances=0, score=0;
        do{
            r=(int)(Math.random() * ((l-1) - 0 + 1) + 0);
            do{
                System.out.println("\nChance:"+(noOfChances+1));
                System.out.println("What is the capital of "+ country[r]);
                capitalEntry=sc.nextLine();
                if(capitalEntry.compareTo(capital[r])==0){
                    System.out.println("Matched");
                    score++;
                    break;
                }
                if(capitalEntry.compareTo("No")==0)
                    break;
                noOfChances++;
            }while(noOfChances<3);
            if(noOfChances>=3)
                System.out.println("Capital of "+country[r]+" is "+capital[r]);
            noOfChances=0;
        }while(capitalEntry.compareTo("No")!=0);
        System.out.println("Your Score is "+score);
    }
}