package com.scwang.smartrefresh.header.internal.pathview;

import android.graphics.Path;

public class PathParser$PathDataNode
{
  public char OooO00o;
  public float[] OooO0O0;
  
  public PathParser$PathDataNode(char paramChar, float[] paramArrayOfFloat)
  {
    this.OooO00o = paramChar;
    this.OooO0O0 = paramArrayOfFloat;
  }
  
  public static void OooO00o(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
  {
    Path localPath = paramPath;
    int i = paramChar2;
    float[] arrayOfFloat = paramArrayOfFloat2;
    int j = 0;
    float f1 = 0.0F;
    float f2 = paramArrayOfFloat1[0];
    int k = 1;
    float f3 = paramArrayOfFloat1[k];
    int m = 2;
    float f4 = 2.802597E-045F;
    float f5 = paramArrayOfFloat1[m];
    int n = 3;
    float f6 = paramArrayOfFloat1[n];
    int i1 = 4;
    float f7 = paramArrayOfFloat1[i1];
    int i2 = 5;
    float f8 = paramArrayOfFloat1[i2];
    int i4;
    float f9;
    switch (paramChar2)
    {
    default: 
    case 'Z': 
    case 'z': 
      for (;;)
      {
        i3 = m;
        break;
        paramPath.close();
        paramPath.moveTo(f7, f8);
        f2 = f7;
        f5 = f7;
        f3 = f8;
        f6 = f8;
      }
    case 'Q': 
    case 'S': 
    case 'q': 
    case 's': 
      i3 = i1;
      break;
    case 'H': 
    case 'V': 
    case 'h': 
    case 'v': 
      i3 = k;
      break;
    case 'C': 
    case 'c': 
      i4 = 6;
      f9 = 8.407791E-045F;
      break;
    case 'A': 
    case 'a': 
      i4 = 7;
      f9 = 9.809089E-045F;
    }
    int i3 = i4;
    float f10 = f2;
    float f11 = f3;
    float f12 = f7;
    float f13 = f8;
    int i5 = 0;
    float f14 = 0.0F;
    int i6 = paramChar1;
    for (;;)
    {
      int i11 = arrayOfFloat.length;
      if (i5 >= i11) {
        break;
      }
      i11 = 65;
      f3 = 9.10844E-044F;
      int i15;
      label805:
      label1240:
      int i18;
      int i19;
      if (i != i11)
      {
        i11 = 67;
        f3 = 9.3887E-044F;
        if (i != i11)
        {
          int i12 = 72;
          f8 = 1.008935E-043F;
          if (i != i12)
          {
            i12 = 81;
            f8 = 1.135052E-043F;
            int i16;
            if (i != i12)
            {
              i4 = 86;
              f9 = 1.205117E-043F;
              if (i != i4)
              {
                i4 = 97;
                f9 = 1.35926E-043F;
                int i13;
                float f15;
                if (i != i4)
                {
                  i4 = 99;
                  f9 = 1.387286E-043F;
                  int i14;
                  if (i != i4)
                  {
                    m = 104;
                    f4 = 1.45735E-043F;
                    if (i != m)
                    {
                      m = 113;
                      f4 = 1.583467E-043F;
                      if (i != m)
                      {
                        k = 118;
                        if (i != k)
                        {
                          k = 76;
                          if (i != k)
                          {
                            k = 77;
                            if (i != k)
                            {
                              k = 115;
                              j = 83;
                              f1 = 1.163078E-043F;
                              i13 = 1073741824;
                              f15 = 2.0F;
                              if (i != j)
                              {
                                i14 = 116;
                                f7 = 1.625506E-043F;
                                j = 84;
                                f1 = 1.177091E-043F;
                                if (i != j)
                                {
                                  i11 = 108;
                                  f3 = 1.513402E-043F;
                                  if (i != i11)
                                  {
                                    i11 = 109;
                                    f3 = 1.527415E-043F;
                                    if (i != i11) {
                                      if (i != k) {
                                        if (i == i14) {}
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  for (;;)
                  {
                    i15 = i5;
                    break;
                    if ((i6 != m) && (i6 != i14) && (i6 != i12) && (i6 != j))
                    {
                      i6 = 0;
                      f2 = 0.0F;
                      i14 = 0;
                      f7 = 0.0F;
                    }
                    else
                    {
                      f7 = f10 - f5;
                      f2 = f11 - f6;
                    }
                    i11 = i5 + 0;
                    f5 = arrayOfFloat[i11];
                    i16 = i5 + 1;
                    f8 = arrayOfFloat[i16];
                    localPath.rQuadTo(f7, f2, f5, f8);
                    f7 += f10;
                    f2 += f11;
                    f3 = arrayOfFloat[i11];
                    f10 += f3;
                    f3 = arrayOfFloat[i16];
                    f11 += f3;
                    f6 = f2;
                    f5 = f7;
                    continue;
                    int i17;
                    if ((i6 != i4) && (i6 != k))
                    {
                      i11 = 67;
                      f3 = 9.3887E-044F;
                      if (i6 != i11)
                      {
                        i11 = 83;
                        f3 = 1.163078E-043F;
                        if (i6 != i11)
                        {
                          i11 = 0;
                          f3 = 0.0F;
                          i17 = 0;
                          f5 = 0.0F;
                          break label805;
                        }
                      }
                    }
                    f2 = f10 - f5;
                    f5 = f11 - f6;
                    f3 = f2;
                    j = i5 + 0;
                    f6 = arrayOfFloat[j];
                    k = i5 + 1;
                    f7 = arrayOfFloat[k];
                    m = i5 + 2;
                    f8 = arrayOfFloat[m];
                    i13 = i5 + 3;
                    f9 = arrayOfFloat[i13];
                    paramPath.rCubicTo(f3, f5, f6, f7, f8, f9);
                    f2 = arrayOfFloat[j] + f10;
                    f3 = arrayOfFloat[k] + f11;
                    f5 = arrayOfFloat[m];
                    f10 += f5;
                    f5 = arrayOfFloat[i13];
                    break label1791;
                    i6 = i5 + 0;
                    f2 = arrayOfFloat[i6];
                    f10 += f2;
                    i11 = i5 + 1;
                    f3 = arrayOfFloat[i11];
                    f11 += f3;
                    if (i5 > 0)
                    {
                      localPath.rLineTo(f2, f3);
                    }
                    else
                    {
                      localPath.rMoveTo(f2, f3);
                      break label1399;
                      i6 = i5 + 0;
                      f3 = arrayOfFloat[i6];
                      i14 = i5 + 1;
                      f8 = arrayOfFloat[i14];
                      localPath.rLineTo(f3, f8);
                      f2 = arrayOfFloat[i6];
                      f10 += f2;
                      for (f2 = arrayOfFloat[i14];; f2 = arrayOfFloat[i6])
                      {
                        f11 += f2;
                        break;
                        if ((i6 == m) || (i6 == i14) || (i6 == i12) || (i6 == j))
                        {
                          f10 = f10 * f15 - f5;
                          f11 = f11 * f15 - f6;
                        }
                        i6 = i5 + 0;
                        f3 = arrayOfFloat[i6];
                        i17 = i5 + 1;
                        f6 = arrayOfFloat[i17];
                        localPath.quadTo(f10, f11, f3, f6);
                        f2 = arrayOfFloat[i6];
                        f3 = arrayOfFloat[i17];
                        i15 = i5;
                        f6 = f11;
                        f5 = f10;
                        f10 = f2;
                        f11 = f3;
                        break label2605;
                        if ((i6 != i4) && (i6 != k))
                        {
                          i11 = 67;
                          f3 = 9.3887E-044F;
                          if (i6 != i11)
                          {
                            i11 = 83;
                            f3 = 1.163078E-043F;
                            if (i6 != i11) {
                              break label1240;
                            }
                          }
                        }
                        f10 = f10 * f15 - f5;
                        f11 = f11 * f15 - f6;
                        f5 = f11;
                        f3 = f10;
                        i18 = i5 + 0;
                        f6 = arrayOfFloat[i18];
                        i19 = i5 + 1;
                        f7 = arrayOfFloat[i19];
                        j = i5 + 2;
                        f8 = arrayOfFloat[j];
                        k = i5 + 3;
                        f9 = arrayOfFloat[k];
                        paramPath.cubicTo(f10, f11, f6, f7, f8, f9);
                        f2 = arrayOfFloat[i18];
                        f3 = arrayOfFloat[i19];
                        f10 = arrayOfFloat[j];
                        f11 = arrayOfFloat[k];
                        break label1798;
                        i6 = i5 + 0;
                        f10 = arrayOfFloat[i6];
                        i6 = i5 + 1;
                        f11 = arrayOfFloat[i6];
                        if (i5 > 0)
                        {
                          localPath.lineTo(f10, f11);
                          break;
                        }
                        localPath.moveTo(f10, f11);
                        label1399:
                        i15 = i5;
                        f13 = f11;
                        f12 = f10;
                        break label2605;
                        i6 = i5 + 0;
                        f3 = arrayOfFloat[i6];
                        i14 = i5 + 1;
                        f8 = arrayOfFloat[i14];
                        localPath.lineTo(f3, f8);
                        f10 = arrayOfFloat[i6];
                        f11 = arrayOfFloat[i14];
                        break;
                        i6 = i5 + 0;
                        f3 = arrayOfFloat[i6];
                        i14 = 0;
                        f7 = 0.0F;
                        localPath.rLineTo(0.0F, f3);
                      }
                      i6 = i5 + 0;
                      f3 = arrayOfFloat[i6];
                      i17 = i5 + 1;
                      f6 = arrayOfFloat[i17];
                      i14 = i5 + 2;
                      f8 = arrayOfFloat[i14];
                      i4 = i5 + 3;
                      f1 = arrayOfFloat[i4];
                      localPath.rQuadTo(f3, f6, f8, f1);
                      f2 = arrayOfFloat[i6] + f10;
                      f3 = arrayOfFloat[i17] + f11;
                      f5 = arrayOfFloat[i14];
                      f10 += f5;
                      f5 = arrayOfFloat[i4];
                      break label1791;
                      i6 = i5 + 0;
                      f3 = arrayOfFloat[i6];
                      i14 = 0;
                      f7 = 0.0F;
                      localPath.rLineTo(f3, 0.0F);
                      f2 = arrayOfFloat[i6];
                      f10 += f2;
                      continue;
                      i6 = i5 + 0;
                      f3 = arrayOfFloat[i6];
                      i6 = i5 + 1;
                      f5 = arrayOfFloat[i6];
                      j = i5 + 2;
                      f6 = arrayOfFloat[j];
                      k = i5 + 3;
                      f7 = arrayOfFloat[k];
                      m = i5 + 4;
                      f8 = arrayOfFloat[m];
                      i13 = i5 + 5;
                      f9 = arrayOfFloat[i13];
                      paramPath.rCubicTo(f3, f5, f6, f7, f8, f9);
                      f2 = arrayOfFloat[j] + f10;
                      f3 = arrayOfFloat[k] + f11;
                      f5 = arrayOfFloat[m];
                      f10 += f5;
                      f5 = arrayOfFloat[i13];
                      label1791:
                      f11 += f5;
                      label1798:
                      f5 = f2;
                      f6 = f3;
                    }
                  }
                }
                j = i5 + 5;
                f6 = arrayOfFloat[j] + f10;
                k = i5 + 6;
                f7 = arrayOfFloat[k] + f11;
                i6 = i5 + 0;
                f8 = arrayOfFloat[i6];
                i6 = i5 + 1;
                f9 = arrayOfFloat[i6];
                i6 = i5 + 2;
                f4 = arrayOfFloat[i6];
                i6 = i5 + 3;
                f2 = arrayOfFloat[i6];
                i11 = 0;
                f3 = 0.0F;
                boolean bool1 = f2 < 0.0F;
                if (bool1)
                {
                  i13 = 1;
                  f15 = 1.4E-45F;
                }
                else
                {
                  i13 = 0;
                  f15 = 0.0F;
                }
                int i7 = i5 + 4;
                f2 = arrayOfFloat[i7];
                boolean bool2 = f2 < 0.0F;
                int i20;
                float f16;
                if (bool2)
                {
                  i20 = 1;
                  f16 = 1.4E-45F;
                }
                else
                {
                  i20 = 0;
                  f16 = 0.0F;
                }
                f3 = f10;
                f5 = f11;
                i15 = i5;
                f14 = f4;
                f4 = f11;
                i18 = i13;
                f11 = f15;
                f17 = f10;
                i19 = i20;
                f10 = f16;
                OooO0OO(paramPath, f3, f5, f6, f7, f8, f9, f14, i13, i20);
                f2 = arrayOfFloat[j];
                f10 = f3 + f2;
                f2 = arrayOfFloat[k];
                f11 = f5 + f2;
              }
              else
              {
                i15 = i5;
                f17 = f10;
                i5 += 0;
                f2 = arrayOfFloat[i5];
                localPath.lineTo(f10, f2);
                f11 = arrayOfFloat[i5];
                break label2605;
              }
            }
            else
            {
              i15 = i5;
              i5 += 0;
              f2 = arrayOfFloat[i5];
              i11 = i15 + 1;
              f5 = arrayOfFloat[i11];
              i16 = i15 + 2;
              f7 = arrayOfFloat[i16];
              i12 = i15 + 3;
              f9 = arrayOfFloat[i12];
              localPath.quadTo(f2, f5, f7, f9);
              f2 = arrayOfFloat[i5];
              f3 = arrayOfFloat[i11];
              f10 = arrayOfFloat[i16];
              f11 = arrayOfFloat[i12];
              f5 = f2;
              f6 = f3;
              break label2605;
            }
          }
          else
          {
            i15 = i5;
            f4 = f11;
            i5 += 0;
            f2 = arrayOfFloat[i5];
            localPath.lineTo(f2, f11);
            f10 = arrayOfFloat[i5];
            break label2605;
          }
        }
        else
        {
          i15 = i5;
          i5 += 0;
          f3 = arrayOfFloat[i5];
          i5 = i15 + 1;
          f5 = arrayOfFloat[i5];
          i5 = i15 + 2;
          f6 = arrayOfFloat[i5];
          i18 = i15 + 3;
          f7 = arrayOfFloat[i18];
          i19 = i15 + 4;
          f8 = arrayOfFloat[i19];
          i = i15 + 5;
          f9 = arrayOfFloat[i];
          paramPath.cubicTo(f3, f5, f6, f7, f8, f9);
          f10 = arrayOfFloat[i19];
          f2 = arrayOfFloat[i];
          f3 = arrayOfFloat[i5];
          f5 = arrayOfFloat[i18];
          f11 = f2;
          f6 = f5;
          f5 = f3;
          break label2605;
        }
      }
      else
      {
        i15 = i5;
        f4 = f11;
        f17 = f10;
        j = i5 + 5;
        f6 = arrayOfFloat[j];
        k = i5 + 6;
        f7 = arrayOfFloat[k];
        i5 += 0;
        f8 = arrayOfFloat[i5];
        i5 = i15 + 1;
        f9 = arrayOfFloat[i5];
        i5 = i15 + 2;
        f14 = arrayOfFloat[i5];
        int i8 = i15 + 3;
        f2 = arrayOfFloat[i8];
        i11 = 0;
        f3 = 0.0F;
        boolean bool3 = f2 < 0.0F;
        if (bool3)
        {
          i18 = 1;
          f11 = 1.4E-45F;
        }
        else
        {
          i18 = 0;
          f11 = 0.0F;
        }
        int i9 = i15 + 4;
        f2 = arrayOfFloat[i9];
        boolean bool4 = f2 < 0.0F;
        if (bool4)
        {
          i19 = 1;
          f10 = 1.4E-45F;
        }
        else
        {
          i19 = 0;
          f10 = 0.0F;
        }
        f3 = f17;
        f5 = f4;
        OooO0OO(paramPath, f17, f4, f6, f7, f8, f9, f14, i18, i19);
        f10 = arrayOfFloat[j];
        f11 = arrayOfFloat[k];
      }
      f6 = f11;
      f5 = f10;
      label2605:
      i5 = i15 + i3;
      int i10 = paramChar2;
      i = paramChar2;
      j = 0;
      f1 = 0.0F;
      k = 1;
      m = 2;
      f4 = 2.802597E-045F;
    }
    f4 = f11;
    float f17 = f10;
    paramArrayOfFloat1[0] = f10;
    paramArrayOfFloat1[1] = f11;
    paramArrayOfFloat1[2] = f5;
    paramArrayOfFloat1[n] = f6;
    paramArrayOfFloat1[i1] = f12;
    paramArrayOfFloat1[i2] = f13;
  }
  
  public static void OooO0O0(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    double d1 = paramDouble3;
    double d2 = 4.0D;
    double d3 = paramDouble9 * d2;
    double d4 = 3.141592653589793D;
    d3 = Math.ceil(Math.abs(d3 / d4));
    int i = (int)d3;
    double d5 = Math.cos(paramDouble7);
    double d6 = Math.sin(paramDouble7);
    double d7 = Math.cos(paramDouble8);
    double d8 = Math.sin(paramDouble8);
    double d9 = -paramDouble3;
    double d10 = d9 * d5;
    double d11 = d10 * d8;
    double d12 = paramDouble4 * d6;
    double d13 = d12 * d7;
    d11 -= d13;
    d9 *= d6;
    d8 *= d9;
    d13 = paramDouble4 * d5;
    d7 *= d13;
    d8 += d7;
    d7 = i;
    d7 = paramDouble9 / d7;
    double d14 = d8;
    double d15 = d11;
    int j = 0;
    d8 = paramDouble5;
    d11 = paramDouble6;
    double d16 = paramDouble8;
    while (j < i)
    {
      double d17 = d16 + d7;
      double d18 = Math.sin(d17);
      double d19 = Math.cos(d17);
      double d20 = d1 * d5 * d19;
      d20 = paramDouble1 + d20;
      double d21 = d12 * d18;
      double d22 = d20 - d21;
      d20 = d1 * d6 * d19;
      d20 = paramDouble2 + d20;
      d21 = d13 * d18;
      d1 = d20 + d21;
      d20 = d10 * d18;
      d21 = d12 * d19;
      d20 -= d21;
      d18 *= d9;
      d19 *= d13;
      d18 += d19;
      d16 = d17 - d16;
      d19 = Math.tan(d16 / 2.0D);
      d16 = Math.sin(d16);
      d21 = 3.0D;
      double d23 = d19 * d21 * d19;
      double d24 = 4.0D;
      d19 = Math.sqrt(d23 + d24);
      d23 = 1.0D;
      d19 -= d23;
      d16 = d16 * d19 / d21;
      d15 *= d16;
      d8 += d15;
      d14 *= d16;
      d15 = d5;
      d5 = d11 + d14;
      d11 = d16 * d20;
      paramDouble7 = d6;
      d6 = d22 - d11;
      d16 *= d18;
      paramDouble4 = d7;
      d7 = d1 - d16;
      d11 = d9;
      paramPath.rLineTo(0.0F, 0.0F);
      float f1 = (float)d8;
      float f2 = (float)d5;
      float f3 = (float)d6;
      float f4 = (float)d7;
      float f5 = (float)d22;
      float f6 = (float)d1;
      paramPath.cubicTo(f1, f2, f3, f4, f5, f6);
      j += 1;
      d7 = paramDouble4;
      d6 = paramDouble7;
      d8 = d22;
      d5 = d15;
      d16 = d17;
      d14 = d18;
      d15 = d20;
      d11 = d1;
      d1 = paramDouble3;
    }
  }
  
  public static void OooO0OO(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f1 = paramFloat1;
    double d1 = Math.toRadians(paramFloat7);
    double d2 = Math.cos(d1);
    double d3 = Math.sin(d1);
    double d4 = paramFloat1;
    double d5 = d4 * d2;
    float f2 = paramFloat2;
    double d6 = d4;
    d4 = paramFloat2;
    double d7 = d4 * d3;
    d5 += d7;
    double d8 = paramFloat5;
    d5 /= d8;
    float f3 = -paramFloat1;
    double d9 = f3 * d3;
    d7 = d4 * d2;
    d9 += d7;
    d7 = d4;
    d4 = paramFloat6;
    d9 /= d4;
    double d10 = paramFloat3 * d2;
    float f4 = paramFloat4;
    double d11 = d9;
    d9 = paramFloat4;
    double d12 = d9 * d3;
    d10 = (d10 + d12) / d8;
    f4 = -paramFloat3;
    d12 = d8;
    d8 = f4 * d3;
    d9 *= d2;
    d8 = (d8 + d9) / d4;
    d9 = d5 - d10;
    double d13 = d11 - d8;
    double d14 = d5 + d10;
    double d15 = 2.0D;
    d14 /= d15;
    double d16 = (d11 + d8) / d15;
    d15 = d9 * d9;
    double d17 = d13 * d13;
    d15 += d17;
    d17 = 0.0D;
    boolean bool1 = d15 < d17;
    if (!bool1) {
      return;
    }
    double d18 = 1.0D / d15;
    double d19 = 0.25D;
    d18 -= d19;
    bool1 = d18 < d17;
    if (bool1)
    {
      f1 = (float)(Math.sqrt(d15) / 1.99999D);
      float f5 = paramFloat5 * f1;
      f2 = paramFloat6 * f1;
      f1 = paramFloat1;
      OooO0OO(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, f5, f2, paramFloat7, paramBoolean1, paramBoolean2);
      return;
    }
    d15 = Math.sqrt(d18);
    d9 *= d15;
    d15 *= d13;
    boolean bool2 = paramBoolean2;
    if (paramBoolean1 == paramBoolean2)
    {
      d14 -= d15;
      d16 += d9;
    }
    else
    {
      d14 += d15;
      d16 -= d9;
    }
    d9 = d11 - d16;
    d11 = d3;
    d3 = d5 - d14;
    d13 = Math.atan2(d9, d3);
    d8 -= d16;
    d10 -= d14;
    double d20 = Math.atan2(d8, d10) - d13;
    boolean bool3 = d20 < d17;
    boolean bool4;
    if (!bool3)
    {
      bool4 = true;
      f2 = 1.4E-45F;
    }
    else
    {
      bool4 = false;
      f2 = 0.0F;
    }
    if (bool2 != bool4)
    {
      d8 = 6.283185307179586D;
      if (bool3) {
        d20 -= d8;
      } else {
        d20 += d8;
      }
    }
    d14 *= d12;
    d16 *= d4;
    double d21 = d14 * d2;
    d3 = d16 * d11;
    double d22 = d21 - d3;
    d21 = d12;
    d14 *= d11;
    d16 *= d2;
    double d23 = d14 + d16;
    d21 = d6;
    d2 = d7;
    d5 = d6;
    d6 = d7;
    d7 = d13;
    d11 = d20;
    OooO0O0(paramPath, d22, d23, d12, d4, d21, d2, d1, d13, d20);
  }
  
  public static void OooO0Oo(PathDataNode[] paramArrayOfPathDataNode, Path paramPath)
  {
    int i = 6;
    float[] arrayOfFloat1 = new float[i];
    int j = paramArrayOfPathDataNode.length;
    char c1 = 'm';
    int k = 0;
    while (k < j)
    {
      PathDataNode localPathDataNode = paramArrayOfPathDataNode[k];
      char c2 = localPathDataNode.OooO00o;
      float[] arrayOfFloat2 = localPathDataNode.OooO0O0;
      OooO00o(paramPath, arrayOfFloat1, c1, c2, arrayOfFloat2);
      c1 = localPathDataNode.OooO00o;
      k += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.pathview.PathParser.PathDataNode
 * JD-Core Version:    0.7.0.1
 */