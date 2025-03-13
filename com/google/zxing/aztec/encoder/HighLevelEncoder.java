package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import m54207b69;

public final class HighLevelEncoder
{
  private static final int[][] CHAR_MAP;
  static final int[][] LATCH_TABLE;
  static final int MODE_DIGIT = 2;
  static final int MODE_LOWER = 1;
  static final int MODE_MIXED = 3;
  static final String[] MODE_NAMES;
  static final int MODE_PUNCT = 4;
  static final int MODE_UPPER;
  static final int[][] SHIFT_TABLE;
  private final Charset charset;
  private final byte[] text;
  
  static
  {
    Object localObject1 = m54207b69.F54207b69_11("gS1E1B0D191B");
    Object localObject2 = m54207b69.F54207b69_11("Ka3135312539");
    String str1 = m54207b69.F54207b69_11("_b3733342A34");
    Object localObject3 = m54207b69.F54207b69_11("HX141811200E");
    String str2 = m54207b69.F54207b69_11("O3777B767D6B");
    String[] tmp35_32 = new String[5];
    String[] tmp36_35 = tmp35_32;
    String[] tmp36_35 = tmp35_32;
    tmp36_35[0] = str1;
    tmp36_35[1] = localObject3;
    String[] tmp43_36 = tmp36_35;
    String[] tmp43_36 = tmp36_35;
    tmp43_36[2] = str2;
    tmp43_36[3] = localObject1;
    tmp43_36[4] = localObject2;
    MODE_NAMES = tmp43_36;
    int i = 5;
    localObject2 = new int[i][];
    str1 = null;
    int j = 327708;
    int k = 327710;
    int m = 327709;
    int n = 656318;
    int[] tmp87_85 = new int[5];
    int[] tmp88_87 = tmp87_85;
    int[] tmp88_87 = tmp87_85;
    tmp88_87[0] = 0;
    tmp88_87[1] = j;
    int[] tmp96_88 = tmp88_87;
    int[] tmp96_88 = tmp88_87;
    tmp96_88[2] = k;
    tmp96_88[3] = m;
    tmp96_88[4] = n;
    int[] arrayOfInt1 = tmp96_88;
    localObject2[0] = arrayOfInt1;
    int[] tmp119_117 = new int[5];
    int[] tmp120_119 = tmp119_117;
    int[] tmp120_119 = tmp119_117;
    tmp120_119[0] = 590318;
    tmp120_119[1] = 0;
    int[] tmp128_120 = tmp120_119;
    int[] tmp128_120 = tmp120_119;
    tmp128_120[2] = k;
    tmp128_120[3] = m;
    tmp128_120[4] = n;
    arrayOfInt1 = tmp128_120;
    int i1 = 1;
    localObject2[i1] = arrayOfInt1;
    int i2 = 262158;
    int i3 = 590300;
    int[] tmp163_161 = new int[5];
    int[] tmp164_163 = tmp163_161;
    int[] tmp164_163 = tmp163_161;
    tmp164_163[0] = i2;
    tmp164_163[1] = i3;
    int[] tmp173_164 = tmp164_163;
    int[] tmp173_164 = tmp164_163;
    tmp173_164[2] = 0;
    tmp173_164[3] = 590301;
    tmp173_164[4] = 932798;
    arrayOfInt1 = tmp173_164;
    int i4 = 2;
    localObject2[i4] = arrayOfInt1;
    int[] tmp199_197 = new int[5];
    int[] tmp200_199 = tmp199_197;
    int[] tmp200_199 = tmp199_197;
    tmp200_199[0] = m;
    tmp200_199[1] = j;
    int[] tmp209_200 = tmp200_199;
    int[] tmp209_200 = tmp200_199;
    tmp209_200[2] = n;
    tmp209_200[3] = 0;
    tmp209_200[4] = k;
    localObject3 = tmp209_200;
    k = 3;
    localObject2[k] = localObject3;
    j = 656382;
    n = 327711;
    int i5 = 656380;
    int[] tmp245_243 = new int[5];
    int[] tmp246_245 = tmp245_243;
    int[] tmp246_245 = tmp245_243;
    tmp246_245[0] = n;
    tmp246_245[1] = i5;
    int[] tmp255_246 = tmp246_245;
    int[] tmp255_246 = tmp246_245;
    tmp255_246[2] = j;
    tmp255_246[3] = 656381;
    tmp255_246[4] = 0;
    localObject3 = tmp255_246;
    m = 4;
    localObject2[m] = localObject3;
    LATCH_TABLE = (int[][])localObject2;
    localObject1 = new int[] { i, 256 };
    localObject2 = Integer.TYPE;
    localObject1 = (int[][])Array.newInstance((Class)localObject2, (int[])localObject1);
    CHAR_MAP = (int[][])localObject1;
    localObject1 = localObject1[0];
    int i6 = 32;
    localObject1[i6] = i1;
    i = 65;
    for (;;)
    {
      j = 90;
      if (i > j) {
        break;
      }
      localObject3 = CHAR_MAP[0];
      n = i + -65 + i4;
      localObject3[i] = n;
      i += 1;
    }
    localObject1 = CHAR_MAP[i1];
    localObject1[i6] = i1;
    i = 97;
    for (;;)
    {
      j = 122;
      if (i > j) {
        break;
      }
      localObject3 = CHAR_MAP[i1];
      n = i + -97 + i4;
      localObject3[i] = n;
      i += 1;
    }
    localObject1 = CHAR_MAP[i4];
    localObject1[i6] = i1;
    i = 48;
    for (;;)
    {
      i6 = 57;
      if (i > i6) {
        break;
      }
      localObject2 = CHAR_MAP[i4];
      j = i + -48 + i4;
      localObject2[i] = j;
      i += 1;
    }
    localObject1 = CHAR_MAP[i4];
    localObject1[44] = 12;
    i6 = 46;
    localObject1[i6] = 13;
    i = 28;
    localObject2 = new int[i];
    Object tmp525_524 = localObject2;
    Object tmp526_525 = tmp525_524;
    Object tmp526_525 = tmp525_524;
    tmp526_525[0] = 0;
    tmp526_525[1] = 32;
    Object tmp534_526 = tmp526_525;
    Object tmp534_526 = tmp526_525;
    tmp534_526[2] = 1;
    tmp534_526[3] = 2;
    Object tmp541_534 = tmp534_526;
    Object tmp541_534 = tmp534_526;
    tmp541_534[4] = 3;
    tmp541_534[5] = 4;
    Object tmp548_541 = tmp541_534;
    Object tmp548_541 = tmp541_534;
    tmp548_541[6] = 5;
    tmp548_541[7] = 6;
    Object tmp558_548 = tmp548_541;
    Object tmp558_548 = tmp548_541;
    tmp558_548[8] = 7;
    tmp558_548[9] = 8;
    Object tmp569_558 = tmp558_548;
    Object tmp569_558 = tmp558_548;
    tmp569_558[10] = 9;
    tmp569_558[11] = 10;
    Object tmp580_569 = tmp569_558;
    Object tmp580_569 = tmp569_558;
    tmp580_569[12] = 11;
    tmp580_569[13] = 12;
    Object tmp591_580 = tmp580_569;
    Object tmp591_580 = tmp580_569;
    tmp591_580[14] = 13;
    tmp591_580[15] = 27;
    Object tmp602_591 = tmp591_580;
    Object tmp602_591 = tmp591_580;
    tmp602_591[16] = 28;
    tmp602_591[17] = 29;
    Object tmp613_602 = tmp602_591;
    Object tmp613_602 = tmp602_591;
    tmp613_602[18] = 30;
    tmp613_602[19] = 31;
    Object tmp624_613 = tmp613_602;
    Object tmp624_613 = tmp613_602;
    tmp624_613[20] = 64;
    tmp624_613[21] = 92;
    Object tmp635_624 = tmp624_613;
    Object tmp635_624 = tmp624_613;
    tmp635_624[22] = 94;
    tmp635_624[23] = 95;
    Object tmp646_635 = tmp635_624;
    Object tmp646_635 = tmp635_624;
    tmp646_635[24] = 96;
    tmp646_635[25] = 124;
    tmp646_635[26] = 126;
    tmp646_635[27] = 127;
    j = 0;
    localObject3 = null;
    while (j < i)
    {
      arrayOfInt2 = CHAR_MAP[k];
      i5 = localObject2[j];
      arrayOfInt2[i5] = j;
      j += 1;
    }
    i6 = 31;
    localObject3 = new int[i6];
    Object tmp719_718 = localObject3;
    Object tmp720_719 = tmp719_718;
    Object tmp720_719 = tmp719_718;
    tmp720_719[0] = 0;
    tmp720_719[1] = 13;
    Object tmp728_720 = tmp720_719;
    Object tmp728_720 = tmp720_719;
    tmp728_720[2] = 0;
    tmp728_720[3] = 0;
    Object tmp735_728 = tmp728_720;
    Object tmp735_728 = tmp728_720;
    tmp735_728[4] = 0;
    tmp735_728[5] = 0;
    Object tmp742_735 = tmp735_728;
    Object tmp742_735 = tmp735_728;
    tmp742_735[6] = 33;
    tmp742_735[7] = 39;
    Object tmp753_742 = tmp742_735;
    Object tmp753_742 = tmp742_735;
    tmp753_742[8] = 35;
    tmp753_742[9] = 36;
    Object tmp764_753 = tmp753_742;
    Object tmp764_753 = tmp753_742;
    tmp764_753[10] = 37;
    tmp764_753[11] = 38;
    Object tmp775_764 = tmp764_753;
    Object tmp775_764 = tmp764_753;
    tmp775_764[12] = 39;
    tmp775_764[13] = 40;
    Object tmp786_775 = tmp775_764;
    Object tmp786_775 = tmp775_764;
    tmp786_775[14] = 41;
    tmp786_775[15] = 42;
    Object tmp797_786 = tmp786_775;
    Object tmp797_786 = tmp786_775;
    tmp797_786[16] = 43;
    tmp797_786[17] = 44;
    Object tmp808_797 = tmp797_786;
    Object tmp808_797 = tmp797_786;
    tmp808_797[18] = 45;
    tmp808_797[19] = 46;
    Object tmp819_808 = tmp808_797;
    Object tmp819_808 = tmp808_797;
    tmp819_808[20] = 47;
    tmp819_808[21] = 58;
    Object tmp830_819 = tmp819_808;
    Object tmp830_819 = tmp819_808;
    tmp830_819[22] = 59;
    tmp830_819[23] = 60;
    Object tmp841_830 = tmp830_819;
    Object tmp841_830 = tmp830_819;
    tmp841_830[24] = 61;
    tmp841_830[25] = 62;
    Object tmp852_841 = tmp841_830;
    Object tmp852_841 = tmp841_830;
    tmp852_841[26] = 63;
    tmp852_841[27] = 91;
    tmp852_841[28] = 93;
    Object tmp868_852 = tmp852_841;
    tmp868_852[29] = 123;
    tmp868_852[30] = 125;
    n = 0;
    int[] arrayOfInt2 = null;
    while (n < i6)
    {
      i5 = localObject3[n];
      if (i5 > 0)
      {
        int[] arrayOfInt3 = CHAR_MAP[m];
        arrayOfInt3[i5] = n;
      }
      n += 1;
    }
    i6 = 6;
    localObject2 = new int[] { i6, i6 };
    localObject3 = Integer.TYPE;
    localObject2 = (int[][])Array.newInstance((Class)localObject3, (int[])localObject2);
    SHIFT_TABLE = (int[][])localObject2;
    j = localObject2.length;
    n = 0;
    arrayOfInt2 = null;
    while (n < j)
    {
      arrayOfInt1 = localObject2[n];
      i2 = -1;
      Arrays.fill(arrayOfInt1, i2);
      n += 1;
    }
    localObject2 = SHIFT_TABLE;
    localObject2[0][m] = 0;
    localObject3 = localObject2[i1];
    localObject3[m] = 0;
    localObject3[0] = i;
    localObject2[k][m] = 0;
    localObject1 = localObject2[i4];
    localObject1[m] = 0;
    localObject1[0] = 15;
  }
  
  public HighLevelEncoder(byte[] paramArrayOfByte)
  {
    this.text = paramArrayOfByte;
    this.charset = null;
  }
  
  public HighLevelEncoder(byte[] paramArrayOfByte, Charset paramCharset)
  {
    this.text = paramArrayOfByte;
    this.charset = paramCharset;
  }
  
  private static Collection simplifyStates(Iterable paramIterable)
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    paramIterable = paramIterable.iterator();
    for (;;)
    {
      boolean bool1 = paramIterable.hasNext();
      if (!bool1) {
        break;
      }
      State localState1 = (State)paramIterable.next();
      Iterator localIterator = localLinkedList.iterator();
      for (;;)
      {
        boolean bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        State localState2 = (State)localIterator.next();
        boolean bool3 = localState2.isBetterThanOrEqualTo(localState1);
        if (bool3)
        {
          i = 0;
          localIterator = null;
          break label118;
        }
        bool2 = localState1.isBetterThanOrEqualTo(localState2);
        if (bool2) {
          localIterator.remove();
        }
      }
      int i = 1;
      label118:
      if (i != 0) {
        localLinkedList.addFirst(localState1);
      }
    }
    return localLinkedList;
  }
  
  private void updateStateForChar(State paramState, int paramInt, Collection paramCollection)
  {
    byte[] arrayOfByte = this.text;
    int i = (char)(arrayOfByte[paramInt] & 0xFF);
    Object localObject1 = CHAR_MAP;
    int j = paramState.getMode();
    localObject1 = localObject1[j];
    int k = localObject1[i];
    j = 0;
    if (k > 0)
    {
      k = 1;
    }
    else
    {
      k = 0;
      localObject1 = null;
    }
    State localState = null;
    for (;;)
    {
      int m = 4;
      if (j > m) {
        break;
      }
      Object localObject2 = CHAR_MAP[j];
      m = localObject2[i];
      if (m > 0)
      {
        if (localState == null) {
          localState = paramState.endBinaryShift(paramInt);
        }
        int n;
        if (k != 0)
        {
          n = paramState.getMode();
          if (j != n)
          {
            n = 2;
            if (j != n) {
              break label155;
            }
          }
        }
        Object localObject3 = localState.latchAndAppend(j, m);
        paramCollection.add(localObject3);
        label155:
        if (k == 0)
        {
          localObject3 = SHIFT_TABLE;
          int i1 = paramState.getMode();
          localObject3 = localObject3[i1];
          n = localObject3[j];
          if (n >= 0)
          {
            localObject2 = localState.shiftAndAppend(j, m);
            paramCollection.add(localObject2);
          }
        }
      }
      j += 1;
    }
    k = paramState.getBinaryShiftByteCount();
    if (k <= 0)
    {
      localObject1 = CHAR_MAP;
      j = paramState.getMode();
      localObject1 = localObject1[j];
      i = localObject1[i];
      if (i != 0) {}
    }
    else
    {
      paramState = paramState.addBinaryShiftChar(paramInt);
      paramCollection.add(paramState);
    }
  }
  
  private static void updateStateForPair(State paramState, int paramInt1, int paramInt2, Collection paramCollection)
  {
    State localState1 = paramState.endBinaryShift(paramInt1);
    int i = 4;
    State localState2 = localState1.latchAndAppend(i, paramInt2);
    paramCollection.add(localState2);
    int j = paramState.getMode();
    if (j != i)
    {
      localState2 = localState1.shiftAndAppend(i, paramInt2);
      paramCollection.add(localState2);
    }
    j = 3;
    int k = 1;
    if ((paramInt2 == j) || (paramInt2 == i))
    {
      paramInt2 = 16 - paramInt2;
      i = 2;
      State localState3 = localState1.latchAndAppend(i, paramInt2).latchAndAppend(i, k);
      paramCollection.add(localState3);
    }
    paramInt2 = paramState.getBinaryShiftByteCount();
    if (paramInt2 > 0)
    {
      paramState = paramState.addBinaryShiftChar(paramInt1);
      paramInt1 += k;
      paramState = paramState.addBinaryShiftChar(paramInt1);
      paramCollection.add(paramState);
    }
  }
  
  private Collection updateStateListForChar(Iterable paramIterable, int paramInt)
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    paramIterable = paramIterable.iterator();
    for (;;)
    {
      boolean bool = paramIterable.hasNext();
      if (!bool) {
        break;
      }
      State localState = (State)paramIterable.next();
      updateStateForChar(localState, paramInt, localLinkedList);
    }
    return simplifyStates(localLinkedList);
  }
  
  private static Collection updateStateListForPair(Iterable paramIterable, int paramInt1, int paramInt2)
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    paramIterable = paramIterable.iterator();
    for (;;)
    {
      boolean bool = paramIterable.hasNext();
      if (!bool) {
        break;
      }
      State localState = (State)paramIterable.next();
      updateStateForPair(localState, paramInt1, paramInt2, localLinkedList);
    }
    return simplifyStates(localLinkedList);
  }
  
  public BitArray encode()
  {
    Object localObject1 = State.INITIAL_STATE;
    Object localObject2 = this.charset;
    if (localObject2 != null)
    {
      localObject2 = CharacterSetECI.getCharacterSetECI((Charset)localObject2);
      if (localObject2 != null)
      {
        i = ((CharacterSetECI)localObject2).getValue();
        localObject1 = ((State)localObject1).appendFLGn(i);
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = m54207b69.F54207b69_11("K]13337F1B221983453A424288473F3D8C4E464E4250533F4F47964853459A");
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = this.charset;
        ((StringBuilder)localObject2).append(localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = Collections.singletonList(localObject1);
    int i = 0;
    localObject2 = null;
    int j = 0;
    Object localObject3 = null;
    for (;;)
    {
      byte[] arrayOfByte = this.text;
      int k = arrayOfByte.length;
      if (j >= k) {
        break;
      }
      k = j + 1;
      int m = arrayOfByte.length;
      if (k < m) {
        m = arrayOfByte[k];
      } else {
        m = 0;
      }
      int n = arrayOfByte[j];
      int i1 = 13;
      int i2;
      if (n != i1)
      {
        i1 = 44;
        i2 = 32;
        if (n != i1)
        {
          i1 = 46;
          if (n != i1)
          {
            i1 = 58;
            if (n == i1) {}
          }
        }
      }
      do
      {
        do
        {
          do
          {
            do
            {
              n = 0;
              arrayOfByte = null;
              break;
            } while (m != i2);
            n = 5;
            break;
          } while (m != i2);
          n = 3;
          break;
        } while (m != i2);
        n = 4;
        break;
        n = 10;
      } while (m != n);
      n = 2;
      if (n > 0)
      {
        localObject1 = updateStateListForPair((Iterable)localObject1, j, n);
        j = k;
      }
      else
      {
        localObject1 = updateStateListForChar((Iterable)localObject1, j);
      }
      j += 1;
    }
    localObject2 = new com/google/zxing/aztec/encoder/HighLevelEncoder$1;
    ((HighLevelEncoder.1)localObject2).<init>(this);
    localObject1 = (State)Collections.min((Collection)localObject1, (Comparator)localObject2);
    localObject2 = this.text;
    return ((State)localObject1).toBitArray((byte[])localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.encoder.HighLevelEncoder
 * JD-Core Version:    0.7.0.1
 */