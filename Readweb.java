import java.net.URL;
import java.util.Scanner;
public class Readweb {
public static void main(String[] args) throws Exception {
//Instantiating the URL class
URL url = new URL("http://www.wikipedia.com");
//Retrieving the contents of the specified page
Scanner sc = new Scanner(url.openStream());
int count=0;
//Instantiating the StringBuffer class to hold the result
//StringBuffer sb = new StringBuffer();
while(sc.hasNext()) {
String str = sc.nextLine() ;
System.out.println(str);
count += str.length();
//System.out.println(sc.next());
}
System.out.println(&quot;The file size has &quot; + count +  "characters");
//System.out.println("Contents of the web page:"+result);
}

}