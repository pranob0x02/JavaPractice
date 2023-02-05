package ReadingUserInput;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println("Bucket Needed: " + getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("Bucket Needed: " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("Bucket Needed: " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("Bucket Needed: " + getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = (int) Math.ceil(width * height);

        return (int) ((wallArea / areaPerBucket) - extraBuckets);
    }


    // overLoaded method
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }


    // overLoaded method
    public static int getBucketCount(double area, double areaPerBucket) {

        /*
        * if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
                }
        *  return (int) (area/areaPerBucket)
        *
        * */

        return getBucketCount(area, 1, areaPerBucket); // area = width * height
    }
}
