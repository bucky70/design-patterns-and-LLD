package practice_area.Builder;

public class COmputer {
    private String CPU;
    private String ram;
    private String memory;
    private String price;
    private COmputer(Builder builder){
        this.CPU=builder.CPU;
    }
    static class Builder{
        private String CPU;
        private String ram;
        private String memory;
        private String price;
        public Builder(String CPU, String ram) throws Exception{
          if(CPU==null || ram==null){
            throw new Exception();
          }
          this.CPU=CPU;
          this.ram=ram;

        }
        public Builder withMemeory(String memory){
           this.memory=memory;
           return this;
        }
        public Builder withPrice(String price){
            this.price=price;
            return this;
         }
         public COmputer build(){
            return new COmputer(this);
         }
    }

}
