class Pair{
    int price;
    int span;
    Pair(int price, int span){
        this.price=price;
        this.span=span;

    }
}
class StockSpanner {
    Stack<Pair>stack;

    public StockSpanner() {
       stack= new Stack<>();   
    }
    
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && stack.peek().price<=price){
         span=span+stack.peek().span;
         stack.pop();  
        }
        
    
    stack.push(new Pair(price,span));
    return span;
}
}

