public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel<-1?-1:(tonerLevel>100?-1:tonerLevel);
        this.duplex = duplex;
        pagesPrinted=0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100){
            if(tonerLevel+tonerAmount>100) return -1;
            else return tonerLevel=tonerLevel+tonerAmount;
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint = duplex?pages/2+pages%2:pages;
        pagesPrinted += pagesToPrint;
        if(duplex) System.out.println("Printing in duplex mode");
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
