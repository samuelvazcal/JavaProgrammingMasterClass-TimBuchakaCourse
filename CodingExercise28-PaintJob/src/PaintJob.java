public class PaintJob {
	public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
		double area = 0;
		double possibleCoverArea = 0;
		double remainingArea = 0;
		double bucketsToBuy = 0;
		double factor = 0;
		if(getBucketCount(width,height,areaPerBucket) <=0 || extraBuckets < 0) {
			return -1;
		} else {
			area = width * height;
			factor = area / areaPerBucket;
			//possibleCoverArea = areaPerBucket * extraBuckets;
			//remainingArea = area - possibleCoverArea;
			bucketsToBuy = Math.ceil(factor)-extraBuckets;
			return (int)bucketsToBuy;
		}
	}

	public static int getBucketCount (double width, double height, double areaPerBucket) {
		double area = 0;
		double bucketsToBuy = 0;
		if(getBucketCount(width*height,areaPerBucket)<=0) {
			return -1;
		} else {
			area = width * height;
			bucketsToBuy = Math.ceil(area / areaPerBucket);
			return (int)bucketsToBuy;
		}
	}

	public static int getBucketCount (double area, double areaPerBucket) {
		int numberBuckets = 0;
		if(area <= 0 || areaPerBucket <= 0) {
			return -1;
		} else {
			numberBuckets = (int)Math.ceil(area / areaPerBucket);
			return numberBuckets;
		}
	}
}
