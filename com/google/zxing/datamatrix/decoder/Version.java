package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

public final class Version
{
  private static final Version[] VERSIONS = ;
  private final int dataRegionSizeColumns;
  private final int dataRegionSizeRows;
  private final Version.ECBlocks ecBlocks;
  private final int symbolSizeColumns;
  private final int symbolSizeRows;
  private final int totalCodewords;
  private final int versionNumber;
  
  private Version(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Version.ECBlocks paramECBlocks)
  {
    this.versionNumber = paramInt1;
    this.symbolSizeRows = paramInt2;
    this.symbolSizeColumns = paramInt3;
    this.dataRegionSizeRows = paramInt4;
    this.dataRegionSizeColumns = paramInt5;
    this.ecBlocks = paramECBlocks;
    paramInt1 = paramECBlocks.getECCodewords();
    Version.ECB[] arrayOfECB = paramECBlocks.getECBlocks();
    paramInt3 = arrayOfECB.length;
    paramInt4 = 0;
    paramInt5 = 0;
    while (paramInt4 < paramInt3)
    {
      paramECBlocks = arrayOfECB[paramInt4];
      int i = paramECBlocks.getCount();
      int j = paramECBlocks.getDataCodewords() + paramInt1;
      i *= j;
      paramInt5 += i;
      paramInt4 += 1;
    }
    this.totalCodewords = paramInt5;
  }
  
  private static Version[] buildVersions()
  {
    Object localObject1 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject2 = localObject1;
    Object localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    Object localObject4 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    int i = 1;
    ((Version.ECB)localObject4).<init>(i, 3, null);
    int j = 5;
    ((Version.ECBlocks)localObject3).<init>(j, (Version.ECB)localObject4, null);
    ((Version)localObject1).<init>(1, 10, 10, 8, 8, (Version.ECBlocks)localObject3);
    Object localObject5 = new com/google/zxing/datamatrix/decoder/Version;
    localObject4 = localObject5;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    Object localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject6).<init>(i, j, null);
    ((Version.ECBlocks)localObject1).<init>(7, (Version.ECB)localObject6, null);
    Object localObject7 = localObject1;
    ((Version)localObject5).<init>(2, 12, 12, 10, 10, (Version.ECBlocks)localObject1);
    localObject7 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject8 = localObject7;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject6).<init>(i, 8, null);
    ((Version.ECBlocks)localObject1).<init>(10, (Version.ECB)localObject6, null);
    Object localObject9 = localObject1;
    ((Version)localObject7).<init>(3, 14, 14, 12, 12, (Version.ECBlocks)localObject1);
    localObject9 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject10 = localObject9;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    int k = 12;
    ((Version.ECB)localObject6).<init>(i, k, null);
    ((Version.ECBlocks)localObject1).<init>(k, (Version.ECB)localObject6, null);
    Object localObject11 = localObject1;
    ((Version)localObject9).<init>(4, 16, 16, 14, 14, (Version.ECBlocks)localObject1);
    localObject5 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject12 = localObject5;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    k = 18;
    ((Version.ECB)localObject6).<init>(i, k, null);
    ((Version.ECBlocks)localObject1).<init>(14, (Version.ECB)localObject6, null);
    localObject7 = localObject1;
    ((Version)localObject5).<init>(5, 18, 18, 16, 16, (Version.ECBlocks)localObject1);
    localObject7 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject13 = localObject7;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject6).<init>(i, 22, null);
    ((Version.ECBlocks)localObject1).<init>(k, (Version.ECB)localObject6, null);
    localObject9 = localObject1;
    ((Version)localObject7).<init>(6, 20, 20, 18, 18, (Version.ECBlocks)localObject1);
    Object localObject14 = new com/google/zxing/datamatrix/decoder/Version;
    int m = j;
    Object localObject15 = localObject14;
    localObject6 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    Object localObject16 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject16).<init>(i, 30, null);
    ((Version.ECBlocks)localObject6).<init>(20, (Version.ECB)localObject16, null);
    Object localObject17 = localObject6;
    ((Version)localObject14).<init>(7, 22, 22, 20, 20, (Version.ECBlocks)localObject6);
    localObject5 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject18 = localObject5;
    localObject16 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    int n = 36;
    ((Version.ECB)localObject3).<init>(i, n, null);
    ((Version.ECBlocks)localObject16).<init>(24, (Version.ECB)localObject3, null);
    localObject7 = localObject16;
    ((Version)localObject5).<init>(8, 24, 24, 22, 22, (Version.ECBlocks)localObject16);
    localObject7 = new com/google/zxing/datamatrix/decoder/Version;
    k = i;
    Object localObject19 = localObject7;
    localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    Object localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(i, 44, null);
    ((Version.ECBlocks)localObject3).<init>(28, (Version.ECB)localObject20, null);
    localObject9 = localObject3;
    ((Version)localObject7).<init>(9, 26, 26, 24, 24, (Version.ECBlocks)localObject3);
    Object localObject21 = new com/google/zxing/datamatrix/decoder/Version;
    localObject5 = localObject21;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject3).<init>(i, 62, null);
    ((Version.ECBlocks)localObject20).<init>(n, (Version.ECB)localObject3, null);
    ((Version)localObject21).<init>(10, 32, 32, 14, 14, (Version.ECBlocks)localObject20);
    Object localObject22 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject23 = localObject22;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject3).<init>(i, 86, null);
    m = 42;
    ((Version.ECBlocks)localObject20).<init>(m, (Version.ECB)localObject3, null);
    Object localObject24 = localObject20;
    ((Version)localObject22).<init>(11, 36, 36, 16, 16, (Version.ECBlocks)localObject20);
    localObject24 = new com/google/zxing/datamatrix/decoder/Version;
    localObject22 = localObject24;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject3 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject3).<init>(i, 114, null);
    ((Version.ECBlocks)localObject20).<init>(48, (Version.ECB)localObject3, null);
    Object localObject25 = localObject20;
    ((Version)localObject24).<init>(12, 40, 40, 18, 18, (Version.ECBlocks)localObject20);
    localObject21 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject26 = localObject21;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    Version.ECB localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(i, 144, null);
    int i1 = 56;
    ((Version.ECBlocks)localObject20).<init>(i1, localECB, null);
    ((Version)localObject21).<init>(13, 44, 44, 20, 20, (Version.ECBlocks)localObject20);
    Object localObject27 = new com/google/zxing/datamatrix/decoder/Version;
    Object localObject28 = localObject27;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(i, 174, null);
    ((Version.ECBlocks)localObject20).<init>(68, localECB, null);
    Object localObject29 = localObject20;
    ((Version)localObject27).<init>(14, 48, 48, 22, 22, (Version.ECBlocks)localObject20);
    Version localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    localObject27 = localVersion1;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    n = 2;
    localECB.<init>(n, 102, null);
    ((Version.ECBlocks)localObject20).<init>(m, localECB, null);
    localVersion1.<init>(15, 52, 52, 24, 24, (Version.ECBlocks)localObject20);
    Version localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject7 = localVersion2;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(n, 140, null);
    ((Version.ECBlocks)localObject20).<init>(i1, localECB, null);
    localVersion2.<init>(16, 64, 64, 14, 14, (Version.ECBlocks)localObject20);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion3 = localVersion1;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    m = 4;
    localECB.<init>(m, 92, null);
    ((Version.ECBlocks)localObject20).<init>(36, localECB, null);
    localVersion1.<init>(17, 72, 72, 16, 16, (Version.ECBlocks)localObject20);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject24 = localVersion2;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(m, 114, null);
    ((Version.ECBlocks)localObject20).<init>(48, localECB, null);
    localVersion2.<init>(18, 80, 80, 18, 18, (Version.ECBlocks)localObject20);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion4 = localVersion1;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(m, 144, null);
    ((Version.ECBlocks)localObject20).<init>(i1, localECB, null);
    localVersion1.<init>(19, 88, 88, 20, 20, (Version.ECBlocks)localObject20);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion5 = localVersion2;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(m, 174, null);
    ((Version.ECBlocks)localObject20).<init>(68, localECB, null);
    localVersion2.<init>(20, 96, 96, 22, 22, (Version.ECBlocks)localObject20);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    localObject29 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    int i2 = 6;
    ((Version.ECB)localObject20).<init>(i2, 136, null);
    ((Version.ECBlocks)localObject1).<init>(i1, (Version.ECB)localObject20, null);
    localVersion1.<init>(21, 104, 104, 24, 24, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject9 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(i2, 175, null);
    ((Version.ECBlocks)localObject1).<init>(68, (Version.ECB)localObject20, null);
    localVersion2.<init>(22, 120, 120, 18, 18, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion6 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(8, 163, null);
    ((Version.ECBlocks)localObject1).<init>(62, (Version.ECB)localObject20, null);
    localVersion1.<init>(23, 132, 132, 20, 20, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject25 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(8, 156, null);
    localECB = new com/google/zxing/datamatrix/decoder/Version$ECB;
    localECB.<init>(n, 155, null);
    ((Version.ECBlocks)localObject1).<init>(62, (Version.ECB)localObject20, localECB, null);
    localVersion2.<init>(24, 144, 144, 22, 22, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion7 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 5, null);
    ((Version.ECBlocks)localObject1).<init>(7, (Version.ECB)localObject20, null);
    localVersion1.<init>(25, 8, 18, 6, 16, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion8 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 10, null);
    ((Version.ECBlocks)localObject1).<init>(11, (Version.ECB)localObject20, null);
    localVersion2.<init>(26, 8, 32, 6, 14, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion9 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 16, null);
    ((Version.ECBlocks)localObject1).<init>(14, (Version.ECB)localObject20, null);
    localVersion1.<init>(27, 12, 26, 10, 24, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject11 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 22, null);
    ((Version.ECBlocks)localObject1).<init>(18, (Version.ECB)localObject20, null);
    localVersion2.<init>(28, 12, 36, 10, 16, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    localObject14 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    i2 = 32;
    ((Version.ECB)localObject20).<init>(1, i2, null);
    ((Version.ECBlocks)localObject1).<init>(24, (Version.ECB)localObject20, null);
    localVersion1.<init>(29, 16, 36, 14, 16, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion10 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 49, null);
    ((Version.ECBlocks)localObject1).<init>(28, (Version.ECB)localObject20, null);
    localVersion2.<init>(30, 16, 48, 14, 22, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion11 = localVersion1;
    int i3 = 8;
    int i4 = 6;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 18, null);
    ((Version.ECBlocks)localObject1).<init>(15, (Version.ECB)localObject20, null);
    localVersion1.<init>(31, i3, 48, i4, 22, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion12 = localVersion2;
    int i5 = 8;
    int i6 = 6;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 24, null);
    ((Version.ECBlocks)localObject1).<init>(18, (Version.ECB)localObject20, null);
    localVersion2.<init>(32, i5, 64, i6, 14, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion13 = localVersion1;
    int i7 = 18;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, i2, null);
    ((Version.ECBlocks)localObject1).<init>(22, (Version.ECB)localObject20, null);
    localVersion1.<init>(33, i3, 80, i4, i7, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion14 = localVersion2;
    int i8 = 22;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 38, null);
    ((Version.ECBlocks)localObject1).<init>(28, (Version.ECB)localObject20, null);
    localVersion2.<init>(34, i5, 96, i6, i8, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    localObject17 = localVersion1;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 49, null);
    ((Version.ECBlocks)localObject1).<init>(i2, (Version.ECB)localObject20, null);
    localVersion1.<init>(35, i3, 120, i4, i7, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion15 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 63, null);
    ((Version.ECBlocks)localObject1).<init>(36, (Version.ECB)localObject20, null);
    localVersion2.<init>(36, i5, 144, i6, i8, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion16 = localVersion1;
    int i9 = 64;
    i7 = 14;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 43, null);
    ((Version.ECBlocks)localObject1).<init>(27, (Version.ECB)localObject20, null);
    localVersion1.<init>(37, 12, i9, 10, i7, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion17 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 64, null);
    ((Version.ECBlocks)localObject1).<init>(36, (Version.ECB)localObject20, null);
    localVersion2.<init>(38, 12, 88, 10, 20, (Version.ECBlocks)localObject1);
    localVersion1 = new com/google/zxing/datamatrix/decoder/Version;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 62, null);
    ((Version.ECBlocks)localObject1).<init>(36, (Version.ECB)localObject20, null);
    localVersion1.<init>(39, 16, i9, 14, i7, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion18 = localVersion2;
    i5 = 20;
    i6 = 18;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 44, null);
    ((Version.ECBlocks)localObject1).<init>(28, (Version.ECB)localObject20, null);
    localVersion2.<init>(40, i5, 36, i6, 16, (Version.ECBlocks)localObject1);
    Version localVersion19 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion20 = localVersion19;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, i1, null);
    ((Version.ECBlocks)localObject1).<init>(34, (Version.ECB)localObject20, null);
    localVersion19.<init>(41, 20, 44, 18, 20, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject21 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 84, null);
    ((Version.ECBlocks)localObject1).<init>(42, (Version.ECB)localObject20, null);
    localVersion2.<init>(42, i5, 64, i6, 14, (Version.ECBlocks)localObject1);
    localVersion19 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion21 = localVersion19;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 72, null);
    ((Version.ECBlocks)localObject1).<init>(38, (Version.ECB)localObject20, null);
    localVersion19.<init>(43, 22, 48, 20, 22, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion22 = localVersion2;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 80, null);
    ((Version.ECBlocks)localObject1).<init>(41, (Version.ECB)localObject20, null);
    localVersion2.<init>(44, 24, 48, 22, 22, (Version.ECBlocks)localObject1);
    localVersion19 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion23 = localVersion19;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 108, null);
    ((Version.ECBlocks)localObject1).<init>(46, (Version.ECB)localObject20, null);
    localVersion19.<init>(45, 24, 64, 22, 14, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    Version localVersion24 = localVersion2;
    i5 = 26;
    i6 = 24;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 70, null);
    ((Version.ECBlocks)localObject1).<init>(38, (Version.ECB)localObject20, null);
    localVersion2.<init>(46, i5, 40, i6, 18, (Version.ECBlocks)localObject1);
    localVersion19 = new com/google/zxing/datamatrix/decoder/Version;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 90, null);
    ((Version.ECBlocks)localObject1).<init>(42, (Version.ECB)localObject20, null);
    localVersion19.<init>(47, 26, 48, 24, 22, (Version.ECBlocks)localObject1);
    localVersion2 = new com/google/zxing/datamatrix/decoder/Version;
    localObject1 = new com/google/zxing/datamatrix/decoder/Version$ECBlocks;
    localObject20 = new com/google/zxing/datamatrix/decoder/Version$ECB;
    ((Version.ECB)localObject20).<init>(1, 118, null);
    ((Version.ECBlocks)localObject1).<init>(50, (Version.ECB)localObject20, null);
    localVersion2.<init>(48, i5, 64, i6, 14, (Version.ECBlocks)localObject1);
    Version[] tmp2691_2688 = new Version[48];
    Version[] tmp2692_2691 = tmp2691_2688;
    Version[] tmp2692_2691 = tmp2691_2688;
    tmp2692_2691[0] = localObject2;
    tmp2692_2691[1] = localObject4;
    Version[] tmp2699_2692 = tmp2692_2691;
    Version[] tmp2699_2692 = tmp2692_2691;
    tmp2699_2692[2] = localObject8;
    tmp2699_2692[3] = localObject10;
    Version[] tmp2708_2699 = tmp2699_2692;
    Version[] tmp2708_2699 = tmp2699_2692;
    tmp2708_2699[4] = localObject12;
    tmp2708_2699[5] = localObject13;
    Version[] tmp2717_2708 = tmp2708_2699;
    Version[] tmp2717_2708 = tmp2708_2699;
    tmp2717_2708[6] = localObject15;
    tmp2717_2708[7] = localObject18;
    Version[] tmp2728_2717 = tmp2717_2708;
    Version[] tmp2728_2717 = tmp2717_2708;
    tmp2728_2717[8] = localObject19;
    tmp2728_2717[9] = localObject5;
    Version[] tmp2739_2728 = tmp2728_2717;
    Version[] tmp2739_2728 = tmp2728_2717;
    tmp2739_2728[10] = localObject23;
    tmp2739_2728[11] = localObject22;
    Version[] tmp2750_2739 = tmp2739_2728;
    Version[] tmp2750_2739 = tmp2739_2728;
    tmp2750_2739[12] = localObject26;
    tmp2750_2739[13] = localObject28;
    Version[] tmp2761_2750 = tmp2750_2739;
    Version[] tmp2761_2750 = tmp2750_2739;
    tmp2761_2750[14] = localObject27;
    tmp2761_2750[15] = localObject7;
    Version[] tmp2772_2761 = tmp2761_2750;
    Version[] tmp2772_2761 = tmp2761_2750;
    tmp2772_2761[16] = localVersion3;
    tmp2772_2761[17] = localObject24;
    Version[] tmp2783_2772 = tmp2772_2761;
    Version[] tmp2783_2772 = tmp2772_2761;
    tmp2783_2772[18] = localVersion4;
    tmp2783_2772[19] = localVersion5;
    Version[] tmp2794_2783 = tmp2783_2772;
    Version[] tmp2794_2783 = tmp2783_2772;
    tmp2794_2783[20] = localObject29;
    tmp2794_2783[21] = localObject9;
    Version[] tmp2805_2794 = tmp2794_2783;
    Version[] tmp2805_2794 = tmp2794_2783;
    tmp2805_2794[22] = localVersion6;
    tmp2805_2794[23] = localObject25;
    Version[] tmp2816_2805 = tmp2805_2794;
    Version[] tmp2816_2805 = tmp2805_2794;
    tmp2816_2805[24] = localVersion7;
    tmp2816_2805[25] = localVersion8;
    Version[] tmp2827_2816 = tmp2816_2805;
    Version[] tmp2827_2816 = tmp2816_2805;
    tmp2827_2816[26] = localVersion9;
    tmp2827_2816[27] = localObject11;
    Version[] tmp2838_2827 = tmp2827_2816;
    Version[] tmp2838_2827 = tmp2827_2816;
    tmp2838_2827[28] = localObject14;
    tmp2838_2827[29] = localVersion10;
    Version[] tmp2849_2838 = tmp2838_2827;
    Version[] tmp2849_2838 = tmp2838_2827;
    tmp2849_2838[30] = localVersion11;
    tmp2849_2838[31] = localVersion12;
    Version[] tmp2860_2849 = tmp2849_2838;
    Version[] tmp2860_2849 = tmp2849_2838;
    tmp2860_2849[32] = localVersion13;
    tmp2860_2849[33] = localVersion14;
    Version[] tmp2871_2860 = tmp2860_2849;
    Version[] tmp2871_2860 = tmp2860_2849;
    tmp2871_2860[34] = localObject17;
    tmp2871_2860[35] = localVersion15;
    Version[] tmp2882_2871 = tmp2871_2860;
    Version[] tmp2882_2871 = tmp2871_2860;
    tmp2882_2871[36] = localVersion16;
    tmp2882_2871[37] = localVersion17;
    Version[] tmp2893_2882 = tmp2882_2871;
    Version[] tmp2893_2882 = tmp2882_2871;
    tmp2893_2882[38] = localVersion1;
    tmp2893_2882[39] = localVersion18;
    Version[] tmp2904_2893 = tmp2893_2882;
    Version[] tmp2904_2893 = tmp2893_2882;
    tmp2904_2893[40] = localVersion20;
    tmp2904_2893[41] = localObject21;
    Version[] tmp2915_2904 = tmp2904_2893;
    Version[] tmp2915_2904 = tmp2904_2893;
    tmp2915_2904[42] = localVersion21;
    tmp2915_2904[43] = localVersion22;
    Version[] tmp2926_2915 = tmp2915_2904;
    Version[] tmp2926_2915 = tmp2915_2904;
    tmp2926_2915[44] = localVersion23;
    tmp2926_2915[45] = localVersion24;
    tmp2926_2915[46] = localVersion19;
    Version[] tmp2942_2926 = tmp2926_2915;
    tmp2942_2926[47] = localVersion2;
    return tmp2942_2926;
  }
  
  public static Version getVersionForDimensions(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & 0x1;
    if (i == 0)
    {
      i = paramInt2 & 0x1;
      if (i == 0)
      {
        Version[] arrayOfVersion = VERSIONS;
        int j = arrayOfVersion.length;
        int k = 0;
        while (k < j)
        {
          Version localVersion = arrayOfVersion[k];
          int m = localVersion.symbolSizeRows;
          if (m == paramInt1)
          {
            m = localVersion.symbolSizeColumns;
            if (m == paramInt2) {
              return localVersion;
            }
          }
          k += 1;
        }
        throw FormatException.getFormatInstance();
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  public int getDataRegionSizeColumns()
  {
    return this.dataRegionSizeColumns;
  }
  
  public int getDataRegionSizeRows()
  {
    return this.dataRegionSizeRows;
  }
  
  public Version.ECBlocks getECBlocks()
  {
    return this.ecBlocks;
  }
  
  public int getSymbolSizeColumns()
  {
    return this.symbolSizeColumns;
  }
  
  public int getSymbolSizeRows()
  {
    return this.symbolSizeRows;
  }
  
  public int getTotalCodewords()
  {
    return this.totalCodewords;
  }
  
  public int getVersionNumber()
  {
    return this.versionNumber;
  }
  
  public String toString()
  {
    return String.valueOf(this.versionNumber);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.Version
 * JD-Core Version:    0.7.0.1
 */