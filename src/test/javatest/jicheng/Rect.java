package test.javatest.jicheng;



public class Rect {
    private Integer width;
    private Integer height;

    public Rect(Integer height,Integer width){
        this.height=height;
        this.width=width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }



    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
 @Override
   public String toString(){
        return "Rect [height="+height+",width="+width+"]";
   }
   public void area(){
       System.out.println("面积："+width*height);
   }

}
