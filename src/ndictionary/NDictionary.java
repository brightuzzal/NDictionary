/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndictionary;

/**
 *
 * @author Uzzal
 */
public class NDictionary 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DictionaryFrame df = new DictionaryFrame();
        df.setVisible(true);
        df.setTitle("Dictionary");
        df.setLocation(300, 200);
        df.setDefaultCloseOperation(df.EXIT_ON_CLOSE);
    }
    
}
