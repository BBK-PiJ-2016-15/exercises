public class ArrayCopier {
	public void copy(int[] src, int[] dst)
	if (src <= dst) {
		CopyLongSrc(src, dst);
	}
	else {
		CopyShortSrc(src, dst)
	}

}


public void CopyLongSrc(int[] src, int[] dst){
	for (int i = 0; i < dst.length; i ++){
		dst[i] = src[i]
	}
}

public void CopyShortSrc(int[] src, int[] dst){
	for (int i = 0; i < dst.length; i ++) {
		src[i] = dst[i]
	}
	for (int i = 0; i > dst.length; i ++) {
		src[i] = 0;
	}
}