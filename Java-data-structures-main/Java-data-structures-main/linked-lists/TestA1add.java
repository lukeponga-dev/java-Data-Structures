import java.io.FileReader;
import java.io.BufferedReader;

class TestA1add{

  private static Object s;

  public static void main(String [] args){

    if(args.length != 1){
      System.err.println("Usage:  java TestA1add <filename>");
      return;
    }

    SList alist = new SList();

    try{
        String [] tokens;
        int count=0;
        
        while(s!=null){
          tokens = ((String) s).split("[^a-zA-Z]+");
          
          for(int i=0;i<tokens.length;i++) {
            count++;

            if(alist.isEmpty()) 
              System.out.println("[" + count + "] Empty! " + alist.length());

            if(alist.has(tokens[i])) {
              System.out.println("[" + count + "] Found: "+tokens[i]+ " " + alist.length());
              alist.remove(tokens[i]);

              if(alist.has(tokens[i]))
                System.err.println("remove failed for: "+ tokens[i]);

            } else{
              System.out.println("["+count+"] Not Found: "+tokens[i]+ " " + alist.length());
              alist.add(tokens[i]);

              if(!alist.has(tokens[i]))
                System.err.println("add failed for: "+ tokens[i]);
            }
          
        }
      }
    } catch(Exception e) {
	    System.err.println("******* TROUBLE: " + e);
    }

    System.out.println("====== My List ======");
    alist.dump();
  }
}
