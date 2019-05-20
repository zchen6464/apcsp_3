import java.util.ArrayList;
import java.util.List;

public class Delimiters {

    private String openDel, closeDel;

    public Delimiters(String openDel, String closeDel)
    {
        this.openDel = openDel;
        this.closeDel = closeDel;
    }

    public ArrayList<String> getDelimitersLIst(String[] tokens)
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].equals(openDel))
            {
                temp.add(tokens[i]);
            }
            if(tokens[i].equals(closeDel))
            {
                temp.add(tokens[i]);
            }
        }
        return temp;
    }

    public boolean isBalanced (ArrayList<String> delimiters)
    {
        int o =0;
        int c = 0;
        for(int i = 0; i < delimiters.size(); i++)
        {
            if(delimiters.get(i).equals(openDel))
            {
                o++;
            }
            if(delimiters.get(i).equals(closeDel))
            {
                c++;
            }
            if(c >o)
            {
                return false;
            }
        }
        if(c != 0)
        {
            return false;
        }
        return true;
    }
}
