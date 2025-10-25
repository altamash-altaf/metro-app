import java.util.*;

public class metroMapCreator {
    
    // NOTE: This class assumes it can access the static HashMap vtces in Graph_M.

    public static void Create_Metro_Map(graph g)
    {
        g.addVertex("Noida Sector 62~B");
        g.addVertex("Noida Sector 52~BA");                                                      //added
        g.addVertex("KP-2~A");                                                                  //added
        g.addVertex("Botanical Garden~BM");
        g.addVertex("JMI~M");                                                                   //a
        g.addVertex("Huaz Khas~MY");                                                            //a
        g.addVertex("IIT~M");                                                                   //a
        g.addVertex("IGI T1~M");                                                                   //a
        g.addVertex("Yamuna Bank~B");
        g.addVertex("Rajiv Chowk~BY");
        g.addVertex("Vaishali~B");
        g.addVertex("Karol Bagh~B");
        g.addVertex("Janak Puri West~BO");
        g.addVertex("Dwarka Sector 21~B");
        g.addVertex("Huda City Center~Y");
        g.addVertex("Saket~Y");
        g.addVertex("Vishwavidyalaya~Y");
        g.addVertex("Chandni Chowk~Y");
        g.addVertex("New Delhi~YO");
        g.addVertex("AIIMS~Y");
        g.addVertex("Shivaji Stadium~O");
        g.addVertex("DDS Campus~O");
        g.addVertex("IGI Airport~O");
        g.addVertex("Rajouri Garden~BP");
        g.addVertex("Netaji Subhash Place~PR");
        g.addVertex("Punjabi Bagh West~P");
        
        g.addEdge("Noida Sector 62~B", "Botanical Garden~B", 8);
        g.addEdge("Noida Sector 62~B", "Noida Sextor 52~BA", 5);
        g.addEdge("Noida Sector 52~B", "KP-2~A", 8);
        g.addEdge("Botanical Garden~B", "Yamuna Bank~B", 10);
        g.addEdge("Botanical Garden~B", "JMI~M", 7);
        g.addEdge("JMI~M", "Huaz Khas~MY", 9);
        g.addEdge("Hauz Khas~MY", "IIT~M", 2);
        g.addEdge("IIT~M", "IGI T1~M", 9);
        g.addEdge("Yamuna Bank~B", "Vaishali~B", 8);
        g.addEdge("Yamuna Bank~B", "Rajiv Chowk~BY", 6);
        g.addEdge("Rajiv Chowk~BY", "Karol Bagh~B", 9);
        g.addEdge("Karol Bagh~B", "Janak Puri West~BO", 7);
        g.addEdge("Janak Puri West~BO", "Dwarka Sector 21~B", 6);
        g.addEdge("Huda City Center~Y", "Saket~Y", 15);
        g.addEdge("Saket~Y", "AIIMS~Y", 6);
        g.addEdge("AIIMS~Y", "Rajiv Chowk~BY", 7);
        g.addEdge("Rajiv Chowk~BY", "New Delhi~YO", 1);
        g.addEdge("New Delhi~YO", "Chandni Chowk~Y", 2);
        g.addEdge("Chandni Chowk~Y", "Vishwavidyalaya~Y", 5);
        g.addEdge("New Delhi~YO", "Shivaji Stadium~O", 2);
        g.addEdge("Shivaji Stadium~O", "DDS Campus~O", 7);
        g.addEdge("DDS Campus~O", "IGI Airport~O", 8);
        g.addEdge("Karol Bagh~B", "Rajouri Garden~BP", 2);
        g.addEdge("Punjabi Bagh West~P", "Rajouri Garden~BP", 2);
        g.addEdge("Punjabi Bagh West~P", "Netaji Subhash Place~PR", 3);
    }
    
    public static String[] printCodelist()
    {
        System.out.println("List of station along with their codes:\n");
        ArrayList<String> keys = new ArrayList<>(graph.vtces.keySet());
        int i=1,j=0,m=1;
        StringTokenizer stname;
        String temp="";
        String codes[] = new String[keys.size()];
        char c;
        for(String key : keys) 
        {
            stname = new StringTokenizer(key);
            codes[i-1] = "";
            j=0;
            while (stname.hasMoreTokens())
            {
                    temp = stname.nextToken();
                    c = temp.charAt(0);
                    while (c>47 && c<58)
                    {
                            codes[i-1]+= c;
                            j++;
                            c = temp.charAt(j);
                    }
                    if ((c<48 || c>57) && c<123)
                            codes[i-1]+= c;
            }
            if (codes[i-1].length() < 2)
                codes[i-1]+= Character.toUpperCase(temp.charAt(1));
                        
            System.out.print(i + ". " + key + "\t");
            if (key.length()<(22-m))
                System.out.print("\t");
            if (key.length()<(14-m))
                System.out.print("\t");
            if (key.length()<(6-m))
                System.out.print("\t");
            System.out.println(codes[i-1]);
            i++;
            if (i == (int)Math.pow(10,m))
                m++;
        }
        return codes;
    }
}