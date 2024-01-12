public void main() {
        String str = "Ignas";
        String reverse = "";
        int length = str.length();
        for(int i=0; i<length; i++){
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
}
