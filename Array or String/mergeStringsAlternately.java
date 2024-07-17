


class mergeStringsAlternately {
    public static void main(String[] args) {

        System.out.println(mergeAlternately("ab","prqs"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

//Find approach in notes folder


//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        int m = word1.length();
//        int n = word2.length();
//        StringBuilder result = new StringBuilder();
//        int i = 0, j = 0;
//
//        while (i < m || j < n) {
//            if (i < m) {
//                result.append(word1.charAt(i++));
//            }
//            if (j < n) {
//                result.append(word2.charAt(j++));
//            }
//        }
//
//        return result.toString();
//    }
//}

//

//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        int m = word1.length();
//        int n = word2.length();
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < Math.max(m, n); i++) {
//            if (i < m) {
//                result.append(word1.charAt(i));
//            }
//            if (i < n) {
//                result.append(word2.charAt(i));
//            }
//        }
//
//        return result.toString();
//    }
//}


//other approaches
// public String mergeAlternately(String word1, String word2) {
//        StringBuffer finalStr = new StringBuffer("");
//        int len1 = word1.length(), len2 = word2.length();
//        int i = 0;
//
//        while (i<len1 && i<len2){
//            finalStr.append(word1.charAt(i)).append(word2.charAt(i));
//            i++;
//        }
//        finalStr.append(word1.substring(i,len1)).append(word2.substring(i,len2));
//
//        return finalStr.toString();
//    }

//
//public String mergeAlternately(String word1, String word2) {
//
//        StringBuilder result = new StringBuilder(word1.length() + word2.length());
//
//        int minLength = Math.min(word1.length(), word2.length());
//
//        for (int i = 0; i < minLength; i++) {
//            result.append(word1.charAt(i)).append(word2.charAt(i));
//        }
//
//        result.append(word1.substring(minLength)).append(word2.substring(minLength));
//
//        return result.toString();
//    }

//
//Time complexity: O(length(word1)+length(word2))
//Space complexity: O(length(word1)+length(word2))
// public String mergeAlternately(String word1, String word2) {
//        char[] w1 = word1.toCharArray();
//        char[] w2 = word2.toCharArray();
//        int m = w1.length;
//        int n = w2.length;
//        StringBuilder wr = new StringBuilder();
//        int i = 0, j = 0;
//        while (i < m || j < n) {
//            if (i < m) {
//                wr.append(w1[i++]);
//            }
//            if (j < n) {
//                wr.append(w2[j++]);
//            }
//        }
//        return wr.toString();
//    }

//public String mergeAlternately(String w1, String w2) {
//
//        char []word1=w1.toCharArray();
//        char[]word2=w2.toCharArray();
//        int n1=word1.length;
//        int n2=word2.length;
//        int l=n1+n2;
//        char arr[]=new char[l];
//        int i=0,j=0,k=0;
//        while(j<n1&&k<n2){
//            if(i%2==0){
//                arr[i]=word1[j];
//                j++;
//                i++;
//            }
//            if(i%2!=0){
//                arr[i]=word2[k];
//                k++;
//                i++;
//            }
//
//        }
//        while(j<n1){
//            arr[i]=word1[j];
//            j++;
//            i++;
//        }
//        while(k<n2){
//            arr[i]=word2[k];
//            i++;
//            k++;
//        }
//        String sb=String.valueOf(arr);
//        return sb;
//    }

//Time Complexity
//O(Max(N1,N2))
//Space Complexity
//O(N1+N2+(N1+N2))


