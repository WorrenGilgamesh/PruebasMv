package Bitso;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.bitso.BitsoTicker;
import com.bitso.exceptions.BitsoAPIException;
import com.bitso.exchange.BookInfo;
import com.bitso.exchange.Ticker;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.netty.util.internal.SocketUtils;
public class TestConnection{
    connection b_connection = new connection();
    @Test
    public void prueba1() throws IOException, BitsoAPIException{
        System.out.println("Estoy en prueba uno");
        BitsoTicker[] tickers = b_connection.B_Ticker();
        for (Ticker ticker : tickers) {
            System.out.println(ticker);
        }
        
    }
    @Test
    public void prueba2() throws IOException, BitsoAPIException{
        System.out.println("Estoy en prueba dos");
        BookInfo[] availableBooks = b_connection.B_Book();
        for (BookInfo bookInfo : availableBooks) {
            System.out.println(bookInfo);
            }
    }
    
}