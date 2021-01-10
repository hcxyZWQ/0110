import java.io.File;

public class text {
    public static void main(String[] args) {
        File file=new File("F:\\a");

    }
    public void show(File file)
    {
        if(file.isDirectory())
        {
            File files[] =file.listFiles();
            for(File f:files)
            {
                shou(files);
            }
        }
        else
        {

        }
    }
}
