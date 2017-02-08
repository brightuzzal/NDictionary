/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndictionary;
import java.util.*;
/**
 *
 * @author Uzzal
 */
public class Words
{
    Object words(Object key)
    {
        Dictionary word = new Hashtable();
        word.put("hello" , "hello.jpg");
        word.put("i" , "i.jpg");
        word.put("student" , "student.jpg");
        word.put("study" , "study.jpg");
        word.put("thank" , "thank.jpg");
        word.put("unity" , "unity.jpg");
        word.put("you" , "you.jpg");
        
        Object value = word.get(key);
        return value;
    }
}
