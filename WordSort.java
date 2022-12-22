import java.util.Scanner;

class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sen = sc.nextLine() + " ";
        int k;

        // counting total words in the given sentence
        int word_count = 0;
        for(int i=0;i<sen.length();i++)
            if(sen.charAt(i) == ' ')
                word_count++;
        // extracting all the words and storing it in a separate array
        k=0;
        String words[] = new String[word_count];
        String word = "";
        for(int i=0;i<sen.length();i++){
            char c = sen.charAt(i);
            if(c != ' '){
                word = word + c;
            }
            else {
                words[k++] = word;
                word = "";
            }
        }
        // Sorting the words array
        String temp;
        for (int i = 0; i < word_count - 1; i++)
        {
            for (int j = i + 1; j < word_count; j++)
            {
                if (words[i].compareTo(words[j]) > 0)
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        // Selecting single words and discarding the duplicates
        k=0;
        String all_words[] = new String[word_count];
        for(int i=0;i<words.length;i++){
            String single_word =  words[i];
            boolean flag = true;
            int c=1;
            for(int m=0;m<all_words.length;m++){
                if(single_word.equals(all_words[m])){
                    flag = false;
                    c++;
                }
            }
            if(flag){
                all_words[k++] = single_word;
                flag = true;
            }
        }
        // calcualting frequencies
        k=0;
        int freq[] = new int[word_count];
        int c = 0;
        for(int i=0;i<all_words.length;i++){
            String single_word =  all_words[i];
            if(single_word != null) {
                for(int j = 0; j < words.length ; j++){
                    if(single_word.equals(words[j])){
                        c++;
                    }
                }
                freq[k++] = c;
                c=0;
            }
        }
        // printing the words and their frequencies
        for(int i=0;i<all_words.length;i++){
            if(all_words[i] != null) {
                System.out.println(all_words[i]+"\t Frequency : "+freq[i]);
            }
        }
    }
}