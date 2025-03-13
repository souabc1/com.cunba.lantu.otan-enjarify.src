import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

public class m54207b69
{
  public static native void F54207b69_00(int paramInt, Object[] paramArrayOfObject);
  
  public static native boolean F54207b69_01(int paramInt, Object[] paramArrayOfObject);
  
  public static native byte F54207b69_02(int paramInt, Object[] paramArrayOfObject);
  
  public static native char F54207b69_03(int paramInt, Object[] paramArrayOfObject);
  
  public static native short F54207b69_04(int paramInt, Object[] paramArrayOfObject);
  
  public static native int F54207b69_05(int paramInt, Object[] paramArrayOfObject);
  
  public static native long F54207b69_06(int paramInt, Object[] paramArrayOfObject);
  
  public static native float F54207b69_07(int paramInt, Object[] paramArrayOfObject);
  
  public static native double F54207b69_08(int paramInt, Object[] paramArrayOfObject);
  
  public static native Object F54207b69_09(int paramInt, Object[] paramArrayOfObject);
  
  public static native void F54207b69_10(Object paramObject);
  
  public static native String F54207b69_11(String paramString);
  
  public static native AssetFileDescriptor F54207b69_12(AssetManager paramAssetManager, String paramString);
  
  public static native InputStream F54207b69_13(Class paramClass, String paramString);
  
  public static native InputStream F54207b69_14(ClassLoader paramClassLoader, String paramString);
  
  static String F54207b69_15(Object paramObject)
  {
    String str;
    if (paramObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("object value: ");
      str = paramObject.getClass().getName();
      localObject = ((StringBuilder)localObject).append(str).append(" - ");
      str = paramObject.toString();
    }
    for (Object localObject = str;; localObject = "object value: null") {
      return localObject;
    }
  }
  
  static boolean is_equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  void ref()
  {
    boolean bool = true;
    Object localObject1 = new Object[8];
    Object localObject2 = Boolean.valueOf(bool);
    localObject1[0] = localObject2;
    localObject2 = Character.valueOf('c');
    localObject1[bool] = localObject2;
    Object localObject3 = Byte.valueOf((byte)0);
    localObject1[2] = localObject3;
    localObject3 = Short.valueOf((short)0);
    localObject1[3] = localObject3;
    localObject3 = Integer.valueOf(0);
    localObject1[4] = localObject3;
    localObject3 = Long.valueOf(0L);
    localObject1[5] = localObject3;
    localObject3 = Float.valueOf(0.0F);
    localObject1[6] = localObject3;
    localObject3 = Double.valueOf(0.0D);
    localObject1[7] = localObject3;
    localObject1 = new java/lang/Object;
    localObject1.<init>();
    localObject1.getClass().getName();
    new ClassCastException();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     m54207b69
 * JD-Core Version:    0.7.0.1
 */