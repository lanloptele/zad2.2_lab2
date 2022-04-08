import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      System.out.print("Podaj słowo:\n");
      Scanner sc=new Scanner(System.in);
      String naszeslowo=sc.nextLine();
      String wynik="";
      char znak;
      int kod;
      int licznik=0;
      for(int w=0;w<naszeslowo.length();w++){
        znak=naszeslowo.charAt(w);
        kod=(int)znak;
        if(kod>=97&&kod<=122){//&& iloczyn logiczny
          kod=kod-32;
          znak=(char)kod;
          ;
        }
        else{
          if(kod>=65&&kod<=90){
            kod=kod+32;
            znak=(char)kod;
            licznik++;
          }}
        wynik=wynik+znak;
        }
    
  System.out.print("Słowo wygląda nastepujaco: " +wynik +"\nIlość poprawek wynosi: " +licznik);
    }
}

