import java.util.Scanner;
public class WordCounter{
    public static void main(String[]args){
    String userSentence=getSentenceInput();
    System.out.println("The sentence has " + countWords(userSentence) + " numbers");
    }
    public static String getSentenceInput(){
        Scanner input=new Scanner (System.in);
        System.out.print("Enter a sentence: ");
        String userInput=input.nextLine();
        input.close();
        return userInput;
    }

    public static int countWords(String sentence){
        String[] words=sentence.split(" ");
        return words.length;
    }
}