import com.sun.jmx.snmp.tasks.Task;

import java.math.BigInteger;
import java.util.concurrent.Callable;

/**
 * Created by azubrilkin on 6/3/2016.
 */
public class AsyncCalculator
{
     public  static Callable<Integer> calculateArraySumm(final int [] values)
     {
         return new Callable<Integer>()
         {
             public Integer call() throws Exception
             {

                 System.out.print("Thread has been started");

                Integer result = 0;

                 for (int i =0; i < values.length; i++)
                 {
                      result = result + values[i];
                 }

                 return result;
             }
         };
     }
}
