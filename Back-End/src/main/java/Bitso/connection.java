/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitso;
import com.bitso.Bitso;
import com.bitso.BitsoTicker;
import com.bitso.exceptions.BitsoAPIException;
import com.bitso.exchange.BookInfo;
import com.bitso.exchange.Ticker;

/**
 *
 * @author WorrenGilgamesh
 */
public class connection {
    static Bitso bitso = new Bitso(System.getenv(""), System.getenv(""));
    
    public BitsoTicker[] B_Ticker() throws BitsoAPIException{
        BitsoTicker[] tickers = bitso.getTicker();
        return tickers;
    }
    public BookInfo[] B_Book() throws BitsoAPIException{
        BookInfo[] availableBooks = bitso.getAvailableBooks();
        return availableBooks;
    }
    

    public static void main(String... argv){
    }
}
