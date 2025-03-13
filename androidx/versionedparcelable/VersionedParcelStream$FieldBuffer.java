package androidx.versionedparcelable;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

class VersionedParcelStream$FieldBuffer
{
  public final ByteArrayOutputStream OooO00o;
  public final DataOutputStream OooO0O0;
  public final int OooO0OO;
  public final DataOutputStream OooO0Oo;
  
  public VersionedParcelStream$FieldBuffer(int paramInt, DataOutputStream paramDataOutputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    this.OooO00o = localByteArrayOutputStream;
    DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
    localDataOutputStream.<init>(localByteArrayOutputStream);
    this.OooO0O0 = localDataOutputStream;
    this.OooO0OO = paramInt;
    this.OooO0Oo = paramDataOutputStream;
  }
  
  public void OooO00o()
  {
    this.OooO0O0.flush();
    ByteArrayOutputStream localByteArrayOutputStream = this.OooO00o;
    int i = localByteArrayOutputStream.size();
    int j = this.OooO0OO << 16;
    int k = (char)-1;
    int m;
    if (i >= k) {
      m = k;
    } else {
      m = i;
    }
    j |= m;
    DataOutputStream localDataOutputStream1 = this.OooO0Oo;
    localDataOutputStream1.writeInt(j);
    if (i >= k)
    {
      localDataOutputStream2 = this.OooO0Oo;
      localDataOutputStream2.writeInt(i);
    }
    localByteArrayOutputStream = this.OooO00o;
    DataOutputStream localDataOutputStream2 = this.OooO0Oo;
    localByteArrayOutputStream.writeTo(localDataOutputStream2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelStream.FieldBuffer
 * JD-Core Version:    0.7.0.1
 */