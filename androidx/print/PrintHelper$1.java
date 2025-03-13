package androidx.print;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.WriteResultCallback;

class PrintHelper$1
  extends AsyncTask
{
  public PrintHelper$1(PrintHelper paramPrintHelper, CancellationSignal paramCancellationSignal, PrintAttributes paramPrintAttributes1, Bitmap paramBitmap, PrintAttributes paramPrintAttributes2, int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback) {}
  
  /* Error */
  public Throwable OooO00o(java.lang.Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	androidx/print/PrintHelper$1:OooO00o	Landroid/os/CancellationSignal;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual 45	android/os/CancellationSignal:isCanceled	()Z
    //   9: istore_2
    //   10: aconst_null
    //   11: astore_3
    //   12: iload_2
    //   13: ifeq +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: new 47	android/print/pdf/PrintedPdfDocument
    //   21: astore_1
    //   22: aload_0
    //   23: getfield 21	androidx/print/PrintHelper$1:OooO0oo	Landroidx/print/PrintHelper;
    //   26: astore 4
    //   28: aload 4
    //   30: getfield 52	androidx/print/PrintHelper:OooO00o	Landroid/content/Context;
    //   33: astore 4
    //   35: aload_0
    //   36: getfield 25	androidx/print/PrintHelper$1:OooO0O0	Landroid/print/PrintAttributes;
    //   39: astore 5
    //   41: aload_1
    //   42: aload 4
    //   44: aload 5
    //   46: invokespecial 55	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   49: aload_0
    //   50: getfield 27	androidx/print/PrintHelper$1:OooO0OO	Landroid/graphics/Bitmap;
    //   53: astore 4
    //   55: aload_0
    //   56: getfield 25	androidx/print/PrintHelper$1:OooO0O0	Landroid/print/PrintAttributes;
    //   59: astore 5
    //   61: aload 5
    //   63: invokevirtual 61	android/print/PrintAttributes:getColorMode	()I
    //   66: istore 6
    //   68: aload 4
    //   70: iload 6
    //   72: invokestatic 64	androidx/print/PrintHelper:OooO00o	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   75: astore 4
    //   77: aload_0
    //   78: getfield 23	androidx/print/PrintHelper$1:OooO00o	Landroid/os/CancellationSignal;
    //   81: astore 5
    //   83: aload 5
    //   85: invokevirtual 45	android/os/CancellationSignal:isCanceled	()Z
    //   88: istore 6
    //   90: iload 6
    //   92: ifeq +5 -> 97
    //   95: aconst_null
    //   96: areturn
    //   97: iconst_1
    //   98: istore 6
    //   100: aload_1
    //   101: iload 6
    //   103: invokevirtual 69	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   106: astore 7
    //   108: getstatic 72	androidx/print/PrintHelper:OooO0oo	Z
    //   111: istore 8
    //   113: iload 8
    //   115: ifeq +32 -> 147
    //   118: new 74	android/graphics/RectF
    //   121: astore 5
    //   123: aload 7
    //   125: invokevirtual 80	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   128: astore 9
    //   130: aload 9
    //   132: invokevirtual 86	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   135: astore 9
    //   137: aload 5
    //   139: aload 9
    //   141: invokespecial 89	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   144: goto +87 -> 231
    //   147: new 47	android/print/pdf/PrintedPdfDocument
    //   150: astore 9
    //   152: aload_0
    //   153: getfield 21	androidx/print/PrintHelper$1:OooO0oo	Landroidx/print/PrintHelper;
    //   156: astore 10
    //   158: aload 10
    //   160: getfield 52	androidx/print/PrintHelper:OooO00o	Landroid/content/Context;
    //   163: astore 10
    //   165: aload_0
    //   166: getfield 29	androidx/print/PrintHelper$1:OooO0Oo	Landroid/print/PrintAttributes;
    //   169: astore 11
    //   171: aload 9
    //   173: aload 10
    //   175: aload 11
    //   177: invokespecial 55	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   180: aload 9
    //   182: iload 6
    //   184: invokevirtual 69	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   187: astore 5
    //   189: new 74	android/graphics/RectF
    //   192: astore 10
    //   194: aload 5
    //   196: invokevirtual 80	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   199: astore 11
    //   201: aload 11
    //   203: invokevirtual 86	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   206: astore 11
    //   208: aload 10
    //   210: aload 11
    //   212: invokespecial 89	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   215: aload 9
    //   217: aload 5
    //   219: invokevirtual 95	android/graphics/pdf/PdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   222: aload 9
    //   224: invokevirtual 98	android/graphics/pdf/PdfDocument:close	()V
    //   227: aload 10
    //   229: astore 5
    //   231: aload 4
    //   233: invokevirtual 103	android/graphics/Bitmap:getWidth	()I
    //   236: istore 12
    //   238: aload 4
    //   240: invokevirtual 106	android/graphics/Bitmap:getHeight	()I
    //   243: istore 13
    //   245: aload_0
    //   246: getfield 31	androidx/print/PrintHelper$1:OooO0o0	I
    //   249: istore 14
    //   251: iload 12
    //   253: iload 13
    //   255: aload 5
    //   257: iload 14
    //   259: invokestatic 109	androidx/print/PrintHelper:OooO0OO	(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    //   262: astore 9
    //   264: iload 8
    //   266: ifeq +6 -> 272
    //   269: goto +42 -> 311
    //   272: aload 5
    //   274: getfield 113	android/graphics/RectF:left	F
    //   277: fstore 15
    //   279: aload 5
    //   281: getfield 116	android/graphics/RectF:top	F
    //   284: fstore 16
    //   286: aload 9
    //   288: fload 15
    //   290: fload 16
    //   292: invokevirtual 122	android/graphics/Matrix:postTranslate	(FF)Z
    //   295: pop
    //   296: aload 7
    //   298: invokevirtual 126	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   301: astore 17
    //   303: aload 17
    //   305: aload 5
    //   307: invokevirtual 132	android/graphics/Canvas:clipRect	(Landroid/graphics/RectF;)Z
    //   310: pop
    //   311: aload 7
    //   313: invokevirtual 126	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   316: astore 5
    //   318: aload 5
    //   320: aload 4
    //   322: aload 9
    //   324: aconst_null
    //   325: invokevirtual 136	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   328: aload_1
    //   329: aload 7
    //   331: invokevirtual 95	android/graphics/pdf/PdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   334: aload_0
    //   335: getfield 23	androidx/print/PrintHelper$1:OooO00o	Landroid/os/CancellationSignal;
    //   338: astore 5
    //   340: aload 5
    //   342: invokevirtual 45	android/os/CancellationSignal:isCanceled	()Z
    //   345: istore 6
    //   347: iload 6
    //   349: ifeq +38 -> 387
    //   352: aload_1
    //   353: invokevirtual 98	android/graphics/pdf/PdfDocument:close	()V
    //   356: aload_0
    //   357: getfield 33	androidx/print/PrintHelper$1:OooO0o	Landroid/os/ParcelFileDescriptor;
    //   360: astore_1
    //   361: aload_1
    //   362: ifnull +7 -> 369
    //   365: aload_1
    //   366: invokevirtual 139	android/os/ParcelFileDescriptor:close	()V
    //   369: aload_0
    //   370: getfield 27	androidx/print/PrintHelper$1:OooO0OO	Landroid/graphics/Bitmap;
    //   373: astore_1
    //   374: aload 4
    //   376: aload_1
    //   377: if_acmpeq +8 -> 385
    //   380: aload 4
    //   382: invokevirtual 142	android/graphics/Bitmap:recycle	()V
    //   385: aconst_null
    //   386: areturn
    //   387: new 144	java/io/FileOutputStream
    //   390: astore 5
    //   392: aload_0
    //   393: getfield 33	androidx/print/PrintHelper$1:OooO0o	Landroid/os/ParcelFileDescriptor;
    //   396: astore 7
    //   398: aload 7
    //   400: invokevirtual 148	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   403: astore 7
    //   405: aload 5
    //   407: aload 7
    //   409: invokespecial 151	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   412: aload_1
    //   413: aload 5
    //   415: invokevirtual 155	android/graphics/pdf/PdfDocument:writeTo	(Ljava/io/OutputStream;)V
    //   418: aload_1
    //   419: invokevirtual 98	android/graphics/pdf/PdfDocument:close	()V
    //   422: aload_0
    //   423: getfield 33	androidx/print/PrintHelper$1:OooO0o	Landroid/os/ParcelFileDescriptor;
    //   426: astore_1
    //   427: aload_1
    //   428: ifnull +7 -> 435
    //   431: aload_1
    //   432: invokevirtual 139	android/os/ParcelFileDescriptor:close	()V
    //   435: aload_0
    //   436: getfield 27	androidx/print/PrintHelper$1:OooO0OO	Landroid/graphics/Bitmap;
    //   439: astore_1
    //   440: aload 4
    //   442: aload_1
    //   443: if_acmpeq +8 -> 451
    //   446: aload 4
    //   448: invokevirtual 142	android/graphics/Bitmap:recycle	()V
    //   451: aconst_null
    //   452: areturn
    //   453: astore_3
    //   454: aload_1
    //   455: invokevirtual 98	android/graphics/pdf/PdfDocument:close	()V
    //   458: aload_0
    //   459: getfield 33	androidx/print/PrintHelper$1:OooO0o	Landroid/os/ParcelFileDescriptor;
    //   462: astore_1
    //   463: aload_1
    //   464: ifnull +7 -> 471
    //   467: aload_1
    //   468: invokevirtual 139	android/os/ParcelFileDescriptor:close	()V
    //   471: aload_0
    //   472: getfield 27	androidx/print/PrintHelper$1:OooO0OO	Landroid/graphics/Bitmap;
    //   475: astore_1
    //   476: aload 4
    //   478: aload_1
    //   479: if_acmpeq +8 -> 487
    //   482: aload 4
    //   484: invokevirtual 142	android/graphics/Bitmap:recycle	()V
    //   487: aload_3
    //   488: athrow
    //   489: areturn
    //   490: pop
    //   491: goto -122 -> 369
    //   494: pop
    //   495: goto -60 -> 435
    //   498: pop
    //   499: goto -28 -> 471
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	502	0	this	1
    //   0	502	1	paramVarArgs	java.lang.Void[]
    //   9	4	2	bool1	boolean
    //   11	1	3	localObject1	Object
    //   453	35	3	localObject2	Object
    //   26	457	4	localObject3	Object
    //   39	375	5	localObject4	Object
    //   66	5	6	i	int
    //   88	95	6	j	int
    //   345	3	6	bool2	boolean
    //   106	302	7	localObject5	Object
    //   111	154	8	bool3	boolean
    //   128	195	9	localObject6	Object
    //   156	72	10	localObject7	Object
    //   169	42	11	localObject8	Object
    //   236	16	12	k	int
    //   243	11	13	m	int
    //   249	9	14	n	int
    //   277	12	15	f1	float
    //   284	7	16	f2	float
    //   301	3	17	localCanvas	android.graphics.Canvas
    //   490	1	21	localIOException1	java.io.IOException
    //   494	1	22	localIOException2	java.io.IOException
    //   498	1	23	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   101	106	453	finally
    //   108	111	453	finally
    //   118	121	453	finally
    //   123	128	453	finally
    //   130	135	453	finally
    //   139	144	453	finally
    //   147	150	453	finally
    //   152	156	453	finally
    //   158	163	453	finally
    //   165	169	453	finally
    //   175	180	453	finally
    //   182	187	453	finally
    //   189	192	453	finally
    //   194	199	453	finally
    //   201	206	453	finally
    //   210	215	453	finally
    //   217	222	453	finally
    //   222	227	453	finally
    //   231	236	453	finally
    //   238	243	453	finally
    //   245	249	453	finally
    //   257	262	453	finally
    //   272	277	453	finally
    //   279	284	453	finally
    //   290	296	453	finally
    //   296	301	453	finally
    //   305	311	453	finally
    //   311	316	453	finally
    //   324	328	453	finally
    //   329	334	453	finally
    //   334	338	453	finally
    //   340	345	453	finally
    //   387	390	453	finally
    //   392	396	453	finally
    //   398	403	453	finally
    //   407	412	453	finally
    //   413	418	453	finally
    //   0	4	489	finally
    //   5	9	489	finally
    //   18	21	489	finally
    //   22	26	489	finally
    //   28	33	489	finally
    //   35	39	489	finally
    //   44	49	489	finally
    //   49	53	489	finally
    //   55	59	489	finally
    //   61	66	489	finally
    //   70	75	489	finally
    //   77	81	489	finally
    //   83	88	489	finally
    //   352	356	489	finally
    //   356	360	489	finally
    //   365	369	489	finally
    //   369	373	489	finally
    //   380	385	489	finally
    //   418	422	489	finally
    //   422	426	489	finally
    //   431	435	489	finally
    //   435	439	489	finally
    //   446	451	489	finally
    //   454	458	489	finally
    //   458	462	489	finally
    //   467	471	489	finally
    //   471	475	489	finally
    //   482	487	489	finally
    //   487	489	489	finally
    //   365	369	490	java/io/IOException
    //   431	435	494	java/io/IOException
    //   467	471	498	java/io/IOException
  }
  
  public void OooO0O0(Throwable paramThrowable)
  {
    Object localObject = this.OooO00o;
    boolean bool = ((CancellationSignal)localObject).isCanceled();
    if (bool)
    {
      paramThrowable = this.OooO0oO;
      paramThrowable.onWriteCancelled();
    }
    else if (paramThrowable == null)
    {
      paramThrowable = this.OooO0oO;
      bool = true;
      localObject = new PageRange[bool];
      PageRange localPageRange = PageRange.ALL_PAGES;
      localObject[0] = localPageRange;
      paramThrowable.onWriteFinished((PageRange[])localObject);
    }
    else
    {
      paramThrowable = this.OooO0oO;
      bool = false;
      localObject = null;
      paramThrowable.onWriteFailed(null);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.print.PrintHelper.1
 * JD-Core Version:    0.7.0.1
 */