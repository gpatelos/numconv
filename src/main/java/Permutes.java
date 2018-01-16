public class Permutes {

    public String getPerm(String s){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<chars.length; i++){
            for(int j = 0; j<chars.length; j++){
                char[] output = chars;
                char hold = output[i];
                output[i] = output[j];
                output[j] = hold;
                sb.append(output);
                sb.append(" ");

            }
        }

        return sb.toString();
    }
}
