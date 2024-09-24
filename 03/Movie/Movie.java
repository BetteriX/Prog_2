public class Movie {
    // private - "Külsöleg ne lehetsen elérni"
    private String title;
    private int year;
    private double score;

    
    public static int count;

    public Movie(String title, int year, double score){
        this.title = title;
        this.year = year;
        SetScore(score);

        count++;
    }

    public String getTitle(){
        return this.title;   
    }

    public int getYear(){
        return this.year;   
    }

    public double getScore(){
        return this.score;   
    }


    public void SetTitle(String NewTitle){
        this.title = NewTitle;
    }

    public void SetYear(int NewYear){
        this.year = NewYear;
    }

    public void SetScore(double NewScore){
        if(0.0 <= NewScore && NewScore <= 10.0){
            this.score = NewScore;
        }
        else if(10.0 < NewScore){
            this.score = 10.0;
        }
        else{
            this.score = 0.0;
        }
    }

    @Override
    public String toString(){
        return this.title + ", " + this.year + ", " + this.score;
    }
}
