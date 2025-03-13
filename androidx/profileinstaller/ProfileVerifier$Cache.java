package androidx.profileinstaller;

import java.util.Objects;

class ProfileVerifier$Cache
{
  public final int OooO00o;
  public final int OooO0O0;
  public final long OooO0OO;
  public final long OooO0Oo;
  
  public ProfileVerifier$Cache(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.OooO00o = paramInt1;
    this.OooO0O0 = paramInt2;
    this.OooO0OO = paramLong1;
    this.OooO0Oo = paramLong2;
  }
  
  /* Error */
  public static Cache OooO00o(java.io.File paramFile)
  {
    // Byte code:
    //   0: new 24	java/io/DataInputStream
    //   3: astore_1
    //   4: new 26	java/io/FileInputStream
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 29	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial 32	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: new 2	androidx/profileinstaller/ProfileVerifier$Cache
    //   21: astore_0
    //   22: aload_1
    //   23: invokevirtual 36	java/io/DataInputStream:readInt	()I
    //   26: istore_3
    //   27: aload_1
    //   28: invokevirtual 36	java/io/DataInputStream:readInt	()I
    //   31: istore 4
    //   33: aload_1
    //   34: invokevirtual 40	java/io/DataInputStream:readLong	()J
    //   37: lstore 5
    //   39: aload_1
    //   40: invokevirtual 40	java/io/DataInputStream:readLong	()J
    //   43: lstore 7
    //   45: aload_0
    //   46: iload_3
    //   47: iload 4
    //   49: lload 5
    //   51: lload 7
    //   53: invokespecial 43	androidx/profileinstaller/ProfileVerifier$Cache:<init>	(IIJJ)V
    //   56: aload_1
    //   57: invokevirtual 48	java/io/InputStream:close	()V
    //   60: aload_0
    //   61: areturn
    //   62: astore_0
    //   63: aload_1
    //   64: invokevirtual 48	java/io/InputStream:close	()V
    //   67: goto +9 -> 76
    //   70: astore_1
    //   71: aload_0
    //   72: aload_1
    //   73: invokevirtual 54	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   76: aload_0
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramFile	java.io.File
    //   3	61	1	localDataInputStream	java.io.DataInputStream
    //   70	3	1	localThrowable	java.lang.Throwable
    //   7	8	2	localFileInputStream	java.io.FileInputStream
    //   26	21	3	i	int
    //   31	17	4	j	int
    //   37	13	5	l1	long
    //   43	9	7	l2	long
    // Exception table:
    //   from	to	target	type
    //   18	21	62	finally
    //   22	26	62	finally
    //   27	31	62	finally
    //   33	37	62	finally
    //   39	43	62	finally
    //   51	56	62	finally
    //   63	67	70	finally
  }
  
  /* Error */
  public void OooO0O0(java.io.File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 60	java/io/File:delete	()Z
    //   4: pop
    //   5: new 62	java/io/DataOutputStream
    //   8: astore_2
    //   9: new 64	java/io/FileOutputStream
    //   12: astore_3
    //   13: aload_3
    //   14: aload_1
    //   15: invokespecial 65	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   18: aload_2
    //   19: aload_3
    //   20: invokespecial 68	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: aload_0
    //   24: getfield 16	androidx/profileinstaller/ProfileVerifier$Cache:OooO00o	I
    //   27: istore 4
    //   29: aload_2
    //   30: iload 4
    //   32: invokevirtual 72	java/io/DataOutputStream:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 18	androidx/profileinstaller/ProfileVerifier$Cache:OooO0O0	I
    //   39: istore 4
    //   41: aload_2
    //   42: iload 4
    //   44: invokevirtual 72	java/io/DataOutputStream:writeInt	(I)V
    //   47: aload_0
    //   48: getfield 20	androidx/profileinstaller/ProfileVerifier$Cache:OooO0OO	J
    //   51: lstore 5
    //   53: aload_2
    //   54: lload 5
    //   56: invokevirtual 76	java/io/DataOutputStream:writeLong	(J)V
    //   59: aload_0
    //   60: getfield 22	androidx/profileinstaller/ProfileVerifier$Cache:OooO0Oo	J
    //   63: lstore 5
    //   65: aload_2
    //   66: lload 5
    //   68: invokevirtual 76	java/io/DataOutputStream:writeLong	(J)V
    //   71: aload_2
    //   72: invokevirtual 79	java/io/OutputStream:close	()V
    //   75: return
    //   76: astore_1
    //   77: aload_2
    //   78: invokevirtual 79	java/io/OutputStream:close	()V
    //   81: goto +9 -> 90
    //   84: astore_2
    //   85: aload_1
    //   86: aload_2
    //   87: invokevirtual 54	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	Cache
    //   0	92	1	paramFile	java.io.File
    //   8	70	2	localDataOutputStream	java.io.DataOutputStream
    //   84	3	2	localThrowable	java.lang.Throwable
    //   12	8	3	localFileOutputStream	java.io.FileOutputStream
    //   27	16	4	i	int
    //   51	16	5	l	long
    // Exception table:
    //   from	to	target	type
    //   23	27	76	finally
    //   30	35	76	finally
    //   35	39	76	finally
    //   42	47	76	finally
    //   47	51	76	finally
    //   54	59	76	finally
    //   59	63	76	finally
    //   66	71	76	finally
    //   77	81	84	finally
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof Cache;
      if (bool2)
      {
        paramObject = (Cache)paramObject;
        int i = this.OooO0O0;
        int k = paramObject.OooO0O0;
        if (i == k)
        {
          long l1 = this.OooO0OO;
          long l2 = paramObject.OooO0OO;
          boolean bool3 = l1 < l2;
          if (!bool3)
          {
            int j = this.OooO00o;
            k = paramObject.OooO00o;
            if (j == k)
            {
              l1 = this.OooO0Oo;
              l2 = paramObject.OooO0Oo;
              boolean bool4 = l1 < l2;
              if (!bool4) {
                break label115;
              }
            }
          }
        }
        bool1 = false;
        label115:
        return bool1;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    Integer localInteger1 = Integer.valueOf(this.OooO0O0);
    Long localLong1 = Long.valueOf(this.OooO0OO);
    Integer localInteger2 = Integer.valueOf(this.OooO00o);
    Long localLong2 = Long.valueOf(this.OooO0Oo);
    Object[] tmp37_34 = new Object[4];
    Object[] tmp38_37 = tmp37_34;
    Object[] tmp38_37 = tmp37_34;
    tmp38_37[0] = localInteger1;
    tmp38_37[1] = localLong1;
    tmp38_37[2] = localInteger2;
    Object[] tmp48_38 = tmp38_37;
    tmp48_38[3] = localLong2;
    return Objects.hash(tmp48_38);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileVerifier.Cache
 * JD-Core Version:    0.7.0.1
 */