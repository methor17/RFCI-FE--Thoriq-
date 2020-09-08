package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
 
/**
 * 
 * @author Yudi Setiawan
 * 
 * Insertion Sort.
 *
 */
 
public class Sort
{
    public static void main(String[] args) throws IOException
    {
        //  Objek BufferedReader
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
         
        //  Input jumlah Data
        System.out.print("Masukkan jumlah Data : ");    int jlh_data = Integer.parseInt(dataIn.readLine());
         
        //  Array Data untuk menampung nilai Data
        int[] data = new int[jlh_data];
         
        //  Menu Pengisian data
      
        
          
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++)
                        {
                            System.out.print("Data ke-"+(a+1)+" : ");   data[a] = Integer.parseInt(dataIn.readLine());
                        }
                         
                           
           
         
        //  Proses Insertion Sort
        System.out.println("\nProses Sort");
        for(int a = 0; a < jlh_data-1; a++)
        {
            System.out.println("Iterasi "+(a+1));
            for(int b = 0; b < jlh_data; b++)
                System.out.print(data[b]+"\t");
             
            System.out.print("   -->  "+data[a+1]+" , "+data[a]);
             
            for(int b = a+1; b > 0; b--)
            {
                String pesan = "   --> Tidak ada pertukaran";
                if(data[b] < data[b-1])
                {
                    pesan = "   --> "+data[b]+" tukar dengan "+data[b-1];
                     
                    //  Proses Pertukaran
                    int temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                     
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                }
                 
                else
                {
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                        break;
                }
            }
            System.out.println("\n");
        }
         
        //  Tampilkan hasil Sorting
        System.out.print("\nHasilSorting : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+" ");
         
    }
}