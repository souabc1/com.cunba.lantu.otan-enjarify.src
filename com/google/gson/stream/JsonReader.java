package com.google.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import m54207b69;

public class JsonReader
  implements Closeable
{
  private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
  private static final char[] NON_EXECUTE_PREFIX = m54207b69.F54207b69_11("R&0F7C5D0430").toCharArray();
  private static final int NUMBER_CHAR_DECIMAL = 3;
  private static final int NUMBER_CHAR_DIGIT = 2;
  private static final int NUMBER_CHAR_EXP_DIGIT = 7;
  private static final int NUMBER_CHAR_EXP_E = 5;
  private static final int NUMBER_CHAR_EXP_SIGN = 6;
  private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
  private static final int NUMBER_CHAR_NONE = 0;
  private static final int NUMBER_CHAR_SIGN = 1;
  private static final int PEEKED_BEGIN_ARRAY = 3;
  private static final int PEEKED_BEGIN_OBJECT = 1;
  private static final int PEEKED_BUFFERED = 11;
  private static final int PEEKED_DOUBLE_QUOTED = 9;
  private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
  private static final int PEEKED_END_ARRAY = 4;
  private static final int PEEKED_END_OBJECT = 2;
  private static final int PEEKED_EOF = 17;
  private static final int PEEKED_FALSE = 6;
  private static final int PEEKED_LONG = 15;
  private static final int PEEKED_NONE = 0;
  private static final int PEEKED_NULL = 7;
  private static final int PEEKED_NUMBER = 16;
  private static final int PEEKED_SINGLE_QUOTED = 8;
  private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
  private static final int PEEKED_TRUE = 5;
  private static final int PEEKED_UNQUOTED = 10;
  private static final int PEEKED_UNQUOTED_NAME = 14;
  private final char[] buffer;
  private final Reader in;
  private boolean lenient = false;
  private int limit;
  private int lineNumber;
  private int lineStart;
  private int[] pathIndices;
  private String[] pathNames;
  int peeked;
  private long peekedLong;
  private int peekedNumberLength;
  private String peekedString;
  private int pos;
  private int[] stack;
  private int stackSize;
  
  static
  {
    JsonReader.1 local1 = new com/google/gson/stream/JsonReader$1;
    local1.<init>();
    com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = local1;
  }
  
  public JsonReader(Reader paramReader)
  {
    char[] arrayOfChar = new char[1024];
    this.buffer = arrayOfChar;
    this.pos = 0;
    this.limit = 0;
    this.lineNumber = 0;
    this.lineStart = 0;
    this.peeked = 0;
    int i = 32;
    int[] arrayOfInt = new int[i];
    this.stack = arrayOfInt;
    int j = 0 + 1;
    this.stackSize = j;
    j = 6;
    arrayOfInt[0] = j;
    Object localObject = new String[i];
    this.pathNames = ((String[])localObject);
    localObject = new int[i];
    this.pathIndices = ((int[])localObject);
    if (paramReader != null)
    {
      this.in = paramReader;
      return;
    }
    paramReader = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("3P393F72707175442C4445");
    paramReader.<init>((String)localObject);
    throw paramReader;
  }
  
  private void checkLenient()
  {
    boolean bool = this.lenient;
    if (bool) {
      return;
    }
    String str = m54207b69.F54207b69_11("r)7C5B4E0C675F4C4E83555258586815695C6E775F5B55625E751A777678691E287D672B6B6E6F728085326E73717C748A747D7F3C97AF9C9E");
    throw syntaxError(str);
  }
  
  private void consumeNonExecutePrefix()
  {
    int i = 1;
    nextNonWhitespace(i);
    int n = this.pos - i;
    this.pos = n;
    char[] arrayOfChar1 = NON_EXECUTE_PREFIX;
    int i1 = arrayOfChar1.length;
    n += i1;
    i1 = this.limit;
    if (n > i1)
    {
      int j = arrayOfChar1.length;
      k = fillBuffer(j);
      if (k == 0) {
        return;
      }
    }
    int k = 0;
    arrayOfChar1 = null;
    char[] arrayOfChar2;
    for (;;)
    {
      arrayOfChar2 = NON_EXECUTE_PREFIX;
      i1 = arrayOfChar2.length;
      if (k >= i1) {
        break;
      }
      char[] arrayOfChar3 = this.buffer;
      int i3 = this.pos + k;
      int i2 = arrayOfChar3[i3];
      n = arrayOfChar2[k];
      if (i2 != n) {
        return;
      }
      k += 1;
    }
    int m = this.pos;
    n = arrayOfChar2.length;
    m += n;
    this.pos = m;
  }
  
  private boolean fillBuffer(int paramInt)
  {
    char[] arrayOfChar = this.buffer;
    int i = this.lineStart;
    int j = this.pos;
    i -= j;
    this.lineStart = i;
    i = this.limit;
    if (i != j)
    {
      i -= j;
      this.limit = i;
      System.arraycopy(arrayOfChar, j, arrayOfChar, 0, i);
    }
    else
    {
      this.limit = 0;
    }
    this.pos = 0;
    int k;
    do
    {
      Reader localReader = this.in;
      j = this.limit;
      k = arrayOfChar.length - j;
      i = localReader.read(arrayOfChar, j, k);
      j = -1;
      if (i == j) {
        break;
      }
      j = this.limit + i;
      this.limit = j;
      i = this.lineNumber;
      k = 1;
      if (i == 0)
      {
        i = this.lineStart;
        if ((i == 0) && (j > 0))
        {
          int m = arrayOfChar[0];
          int n = 65279;
          if (m == n)
          {
            m = this.pos + k;
            this.pos = m;
            i += 1;
            this.lineStart = i;
            paramInt += 1;
          }
        }
      }
    } while (j < paramInt);
    return k;
    return false;
  }
  
  private boolean isLiteral(char paramChar)
  {
    char c = '\t';
    if (paramChar != c)
    {
      c = '\n';
      if (paramChar != c)
      {
        c = '\f';
        if (paramChar != c)
        {
          c = '\r';
          if (paramChar != c)
          {
            c = ' ';
            if (paramChar != c)
            {
              c = '#';
              if (paramChar != c)
              {
                c = ',';
                if (paramChar == c) {
                  break label138;
                }
                c = '/';
                if (paramChar != c)
                {
                  c = '=';
                  if (paramChar != c)
                  {
                    c = '{';
                    if (paramChar == c) {
                      break label138;
                    }
                    c = '}';
                    if (paramChar == c) {
                      break label138;
                    }
                    c = ':';
                    if (paramChar == c) {
                      break label138;
                    }
                    c = ';';
                    if (paramChar == c) {}
                  }
                }
              }
              switch (paramChar)
              {
              default: 
                return true;
              case '\\': 
                checkLenient();
              }
            }
          }
        }
      }
    }
    label138:
    return false;
  }
  
  private int nextNonWhitespace(boolean paramBoolean)
  {
    Object localObject1 = this.buffer;
    int i = this.pos;
    label10:
    int m = this.limit;
    for (;;)
    {
      int i1 = 1;
      Object localObject2;
      String str;
      if (i == m)
      {
        this.pos = i;
        boolean bool1 = fillBuffer(i1);
        if (!bool1)
        {
          if (!paramBoolean) {
            return -1;
          }
          localObject2 = new java/io/EOFException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str = m54207b69.F54207b69_11("7M08242B702630732B2B464244");
          ((StringBuilder)localObject1).append(str);
          str = locationString();
          ((StringBuilder)localObject1).append(str);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((EOFException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        j = this.pos;
        m = this.limit;
      }
      int i2 = j + 1;
      int j = localObject1[j];
      int i3 = 10;
      if (j == i3)
      {
        j = this.lineNumber + i1;
        this.lineNumber = j;
        this.lineStart = i2;
      }
      else
      {
        i3 = 32;
        if (j != i3)
        {
          i3 = 13;
          if (j != i3)
          {
            i3 = 9;
            if (j != i3)
            {
              i3 = 47;
              int i4;
              int n;
              if (j == i3)
              {
                this.pos = i2;
                i4 = 2;
                if (i2 == m)
                {
                  i2 += -1;
                  this.pos = i2;
                  boolean bool3 = fillBuffer(i4);
                  i2 = this.pos + i1;
                  this.pos = i2;
                  if (!bool3) {
                    return j;
                  }
                }
                checkLenient();
                n = this.pos;
                i1 = localObject1[n];
                i2 = 42;
                if (i1 != i2)
                {
                  if (i1 != i3) {
                    return j;
                  }
                  n += 1;
                  this.pos = n;
                }
              }
              for (;;)
              {
                skipToEndOfLine();
                break;
                n += 1;
                this.pos = n;
                str = "*/";
                boolean bool2 = skipTo(str);
                if (bool2)
                {
                  k = this.pos + i4;
                  break label10;
                }
                localObject2 = m54207b69.F54207b69_11("DL19233A2C42262B2935413333783C3130313A344B");
                throw syntaxError((String)localObject2);
                n = 35;
                this.pos = i2;
                if (k != n) {
                  break label384;
                }
                checkLenient();
              }
              label384:
              return k;
            }
          }
        }
      }
      int k = i2;
    }
  }
  
  private String nextQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    int i = 0;
    Object localObject = null;
    label242:
    boolean bool;
    do
    {
      char c1 = this.pos;
      char c2 = this.limit;
      char c3 = c1;
      char c4;
      int j;
      for (;;)
      {
        c4 = '\020';
        j = 1;
        if (c1 >= c2) {
          break label242;
        }
        char c5 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          this.pos = c5;
          c5 = c5 - c3 - j;
          if (localObject == null)
          {
            str = new java/lang/String;
            str.<init>(arrayOfChar, c3, c5);
            return str;
          }
          localObject.append(arrayOfChar, c3, c5);
          return localObject.toString();
        }
        char c6 = '\\';
        if (c1 == c6)
        {
          this.pos = c5;
          c5 = c5 - c3 - j;
          if (localObject == null)
          {
            i = (c5 + '\001') * 2;
            StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
            i = Math.max(i, c4);
            localStringBuilder1.<init>(i);
            localObject = localStringBuilder1;
          }
          localObject.append(arrayOfChar, c3, c5);
          c1 = readEscapeCharacter();
          localObject.append(c1);
          break;
        }
        c4 = '\n';
        if (c1 == c4)
        {
          c1 = this.lineNumber + j;
          this.lineNumber = c1;
          this.lineStart = c5;
        }
        c1 = c5;
      }
      if (localObject == null)
      {
        i = (c1 - c3) * 2;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        i = Math.max(i, c4);
        localStringBuilder2.<init>(i);
        localObject = localStringBuilder2;
      }
      c2 = c1 - c3;
      localObject.append(arrayOfChar, c3, c2);
      this.pos = c1;
      bool = fillBuffer(j);
    } while (bool);
    String str = m54207b69.F54207b69_11("y5605C43534B5D62625C4A5A5C21534F566C6C64");
    throw syntaxError(str);
  }
  
  private String nextUnquotedValue()
  {
    Object localObject = null;
    int i = 0;
    char[] arrayOfChar1;
    label238:
    int n;
    label276:
    label281:
    boolean bool1;
    do
    {
      int j = 0;
      arrayOfChar1 = null;
      boolean bool2;
      do
      {
        for (;;)
        {
          m = this.pos;
          i1 = m + j;
          int i2 = this.limit;
          if (i1 >= i2) {
            break label238;
          }
          char[] arrayOfChar2 = this.buffer;
          m += j;
          m = arrayOfChar2[m];
          i1 = 9;
          if (m == i1) {
            break label276;
          }
          i1 = 10;
          if (m == i1) {
            break label276;
          }
          i1 = 12;
          if (m == i1) {
            break label276;
          }
          i1 = 13;
          if (m == i1) {
            break label276;
          }
          i1 = 32;
          if (m == i1) {
            break label276;
          }
          i1 = 35;
          if (m == i1) {
            break;
          }
          i1 = 44;
          if (m == i1) {
            break label276;
          }
          i1 = 47;
          if (m == i1) {
            break;
          }
          i1 = 61;
          if (m == i1) {
            break;
          }
          i1 = 123;
          if (m == i1) {
            break label276;
          }
          i1 = 125;
          if (m == i1) {
            break label276;
          }
          i1 = 58;
          if (m == i1) {
            break label276;
          }
          i1 = 59;
          if (m == i1) {
            break;
          }
          switch (m)
          {
          default: 
            j += 1;
          }
        }
        checkLenient();
        break;
        arrayOfChar3 = this.buffer;
        int m = arrayOfChar3.length;
        if (j >= m) {
          break label281;
        }
        m = j + 1;
        bool2 = fillBuffer(m);
      } while (bool2);
      i = j;
      break;
      if (localObject == null)
      {
        localObject = new java/lang/StringBuilder;
        n = Math.max(j, 16);
        ((StringBuilder)localObject).<init>(n);
      }
      char[] arrayOfChar3 = this.buffer;
      int i1 = this.pos;
      ((StringBuilder)localObject).append(arrayOfChar3, i1, j);
      n = this.pos + j;
      this.pos = n;
      bool1 = fillBuffer(1);
    } while (bool1);
    if (localObject == null)
    {
      localObject = new java/lang/String;
      arrayOfChar1 = this.buffer;
      n = this.pos;
      ((String)localObject).<init>(arrayOfChar1, n, i);
    }
    else
    {
      arrayOfChar1 = this.buffer;
      n = this.pos;
      ((StringBuilder)localObject).append(arrayOfChar1, n, i);
      localObject = ((StringBuilder)localObject).toString();
    }
    int k = this.pos + i;
    this.pos = k;
    return localObject;
  }
  
  private int peekKeyword()
  {
    Object localObject = this.buffer;
    int i = this.pos;
    int j = localObject[i];
    i = 116;
    if (j != i)
    {
      i = 84;
      if (j != i)
      {
        i = 102;
        if (j != i)
        {
          i = 70;
          if (j != i)
          {
            i = 110;
            if (j != i)
            {
              i = 78;
              if (j != i) {
                return 0;
              }
            }
            localObject = m54207b69.F54207b69_11("C?514B5556");
            str = m54207b69.F54207b69_11("MR1C082021");
            m = 7;
            break label133;
          }
        }
        localObject = m54207b69.F54207b69_11("5%43454B5944");
        str = m54207b69.F54207b69_11("RS151321031A");
        m = 6;
        break label133;
      }
    }
    localObject = m54207b69.F54207b69_11("/541484253");
    String str = m54207b69.F54207b69_11("8k3F3A4031");
    int m = 5;
    label133:
    int n = ((String)localObject).length();
    int i1 = 1;
    while (i1 < n)
    {
      int i2 = this.pos + i1;
      int i4 = this.limit;
      if (i2 >= i4)
      {
        i2 = i1 + 1;
        boolean bool3 = fillBuffer(i2);
        if (!bool3) {
          return 0;
        }
      }
      char[] arrayOfChar = this.buffer;
      i4 = this.pos + i1;
      int i3 = arrayOfChar[i4];
      i4 = ((String)localObject).charAt(i1);
      if (i3 != i4)
      {
        i4 = str.charAt(i1);
        if (i3 != i4) {
          return 0;
        }
      }
      i1 += 1;
    }
    j = this.pos + n;
    i = this.limit;
    if (j >= i)
    {
      j = n + 1;
      boolean bool1 = fillBuffer(j);
      if (!bool1) {}
    }
    else
    {
      localObject = this.buffer;
      i = this.pos + n;
      char c = localObject[i];
      boolean bool2 = isLiteral(c);
      if (bool2) {
        return 0;
      }
    }
    int k = this.pos + n;
    this.pos = k;
    this.peeked = m;
    return m;
  }
  
  private int peekNumber()
  {
    JsonReader localJsonReader = this;
    char[] arrayOfChar = this.buffer;
    int i = this.pos;
    int k = this.limit;
    int m = 0;
    int n = 1;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    boolean bool3 = n;
    long l1 = 0L;
    for (;;)
    {
      int i4 = i + i1;
      int i5 = 2;
      int j;
      int i6;
      label307:
      int i10;
      label389:
      boolean bool4;
      if (i4 == k)
      {
        i = arrayOfChar.length;
        if (i1 == i) {
          return 0;
        }
        i = i1 + 1;
        boolean bool1 = localJsonReader.fillBuffer(i);
        if (bool1)
        {
          j = localJsonReader.pos;
          k = localJsonReader.limit;
        }
      }
      else
      {
        i4 = j + i1;
        i4 = arrayOfChar[i4];
        m = 43;
        i6 = 5;
        if (i4 == m) {
          break label648;
        }
        m = 69;
        if (i4 == m) {
          break label613;
        }
        m = 101;
        if (i4 == m) {
          break label613;
        }
        m = 45;
        if (i4 == m) {
          break label575;
        }
        m = 46;
        int i7 = 3;
        if (i4 == m) {
          break label557;
        }
        m = 48;
        if (i4 >= m)
        {
          m = 57;
          if (i4 <= m)
          {
            if ((i2 != n) && (i2 != 0))
            {
              int i8;
              if (i2 == i5)
              {
                l2 = 0L;
                i8 = l1 < l2;
                if (i8 == 0) {
                  return 0;
                }
                long l3 = 10 * l1;
                i4 += -48;
                long l4 = i4;
                l3 -= l4;
                l4 = -922337203685477580L;
                bool2 = l1 < l4;
                if (!bool2) {
                  if (!bool2)
                  {
                    bool2 = l3 < l1;
                    if (bool2) {}
                  }
                  else
                  {
                    bool2 = false;
                    break label307;
                  }
                }
                bool2 = n;
                bool3 &= bool2;
                l1 = l3;
              }
              else
              {
                if (i2 == i8)
                {
                  bool2 = false;
                  i2 = 4;
                  break label389;
                }
                if (i2 != i6)
                {
                  int i9 = 6;
                  if (i2 != i9) {}
                }
                else
                {
                  bool2 = false;
                  i2 = 7;
                  break label389;
                }
              }
            }
            else
            {
              i4 += -48;
              i10 = -i4;
              l1 = i10;
              i2 = i5;
            }
            bool2 = false;
            l2 = 0L;
            break label669;
          }
        }
        bool4 = localJsonReader.isLiteral(i4);
        if (bool4) {
          break label555;
        }
      }
      if ((i2 == i5) && (bool3))
      {
        long l5 = -9223372036854775808L;
        bool4 = l1 < l5;
        if ((bool4) || (i3 != 0))
        {
          l2 = 0L;
          bool4 = l1 < l2;
          if ((bool4) || (i3 == 0))
          {
            if (i3 == 0) {
              l1 = -l1;
            }
            localJsonReader.peekedLong = l1;
            i12 = localJsonReader.pos + i1;
            localJsonReader.pos = i12;
          }
        }
      }
      int i14;
      for (int i12 = 15;; i14 = 16)
      {
        localJsonReader.peeked = i12;
        return i12;
        if (i2 != i5)
        {
          i12 = 4;
          if (i2 != i12)
          {
            int i13 = 7;
            if (i2 != i13) {
              return 0;
            }
          }
        }
        localJsonReader.peekedNumberLength = i1;
      }
      label555:
      return 0;
      label557:
      boolean bool2 = false;
      long l2 = 0L;
      label575:
      label613:
      int i11;
      if (i2 != i5)
      {
        return 0;
        i10 = 6;
        bool2 = false;
        l2 = 0L;
        if (i2 == 0)
        {
          i2 = n;
          i3 = n;
          break label669;
        }
        if (i2 != i6)
        {
          return 0;
          bool2 = false;
          l2 = 0L;
          if (i2 != i5)
          {
            i10 = 4;
            if (i2 != i10) {
              return 0;
            }
          }
          i2 = i6;
          break label669;
          label648:
          i11 = 6;
          bool2 = false;
          l2 = 0L;
          if (i2 != i6) {
            break;
          }
        }
      }
      i2 = i11;
      label669:
      i1 += 1;
    }
    return 0;
  }
  
  private void push(int paramInt)
  {
    int i = this.stackSize;
    int[] arrayOfInt1 = this.stack;
    int j = arrayOfInt1.length;
    if (i == j)
    {
      j = i * 2;
      int[] arrayOfInt2 = new int[j];
      int k = i * 2;
      int[] arrayOfInt3 = new int[k];
      int m = i * 2;
      String[] arrayOfString = new String[m];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      localObject = this.pathIndices;
      n = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfInt3, 0, n);
      localObject = this.pathNames;
      n = this.stackSize;
      System.arraycopy(localObject, 0, arrayOfString, 0, n);
      this.stack = arrayOfInt2;
      this.pathIndices = arrayOfInt3;
      this.pathNames = arrayOfString;
    }
    Object localObject = this.stack;
    int n = this.stackSize;
    j = n + 1;
    this.stackSize = j;
    localObject[n] = paramInt;
  }
  
  private char readEscapeCharacter()
  {
    int i = this.pos;
    int k = this.limit;
    Object localObject1 = m54207b69.F54207b69_11(")}28140B1B13151A1A2412222469251C2D2C1E2A70222D221F302C3833");
    int i1 = 1;
    if (i == k)
    {
      boolean bool1 = fillBuffer(i1);
      if (!bool1) {
        throw syntaxError((String)localObject1);
      }
    }
    Object localObject2 = this.buffer;
    k = this.pos;
    int i7 = k + 1;
    this.pos = i7;
    int j = localObject2[k];
    k = 10;
    int i6;
    int i9;
    if (j != k)
    {
      i1 = 34;
      if (j != i1)
      {
        int i2 = 39;
        if (j != i2)
        {
          int i3 = 47;
          if (j != i3)
          {
            int i4 = 92;
            if (j != i4)
            {
              int i5 = 98;
              if (j != i5)
              {
                i6 = 102;
                if (j != i6)
                {
                  int i10 = 110;
                  label370:
                  label379:
                  int m;
                  if (j != i10)
                  {
                    int i11 = 114;
                    if (j != i11)
                    {
                      int i12 = 116;
                      if (j != i12)
                      {
                        int i13 = 117;
                        if (j == i13)
                        {
                          j = 4;
                          int i8;
                          i7 += j;
                          int i14 = this.limit;
                          if (i8 > i14)
                          {
                            boolean bool2 = fillBuffer(j);
                            if (!bool2) {
                              throw syntaxError((String)localObject1);
                            }
                          }
                          int i15 = this.pos;
                          i9 = i15 + 4;
                          i14 = 0;
                          while (i15 < i9)
                          {
                            char[] arrayOfChar1 = this.buffer;
                            int i16 = arrayOfChar1[i15];
                            i14 = (char)(i14 << 4);
                            int i19 = 48;
                            if (i16 >= i19)
                            {
                              int i20 = 57;
                              if (i16 <= i20)
                              {
                                i16 += -48;
                                i14 = (char)(i14 + i16);
                                break label370;
                              }
                            }
                            int i21 = 97;
                            int i17;
                            if ((i16 >= i21) && (i16 <= i6)) {
                              i16 += -97;
                            }
                            for (;;)
                            {
                              int i18;
                              i17 += k;
                              break;
                              int i22 = 65;
                              if (i18 < i22) {
                                break label379;
                              }
                              i22 = 70;
                              if (i18 > i22) {
                                break label379;
                              }
                              i18 += -65;
                            }
                            i15 += 1;
                            continue;
                            NumberFormatException localNumberFormatException = new java/lang/NumberFormatException;
                            localObject1 = new java/lang/StringBuilder;
                            ((StringBuilder)localObject1).<init>();
                            ((StringBuilder)localObject1).append("\\u");
                            String str = new java/lang/String;
                            char[] arrayOfChar2 = this.buffer;
                            i14 = this.pos;
                            str.<init>(arrayOfChar2, i14, j);
                            ((StringBuilder)localObject1).append(str);
                            localObject2 = ((StringBuilder)localObject1).toString();
                            localNumberFormatException.<init>((String)localObject2);
                            throw localNumberFormatException;
                          }
                          m = this.pos + j;
                          this.pos = m;
                          return i14;
                        }
                        localObject2 = m54207b69.F54207b69_11("]a28101903110D0B480C1B0C0B1D114F211421261723171A");
                        throw syntaxError((String)localObject2);
                      }
                      return '\t';
                    }
                    return '\r';
                  }
                  return m;
                }
                return '\f';
              }
              return '\b';
            }
          }
        }
      }
    }
    else
    {
      int n = this.lineNumber + i6;
      this.lineNumber = n;
      this.lineStart = i9;
    }
    return j;
  }
  
  private void skipQuotedValue(char paramChar)
  {
    char[] arrayOfChar = this.buffer;
    label105:
    boolean bool;
    do
    {
      char c1 = this.pos;
      char c2 = this.limit;
      int i;
      for (;;)
      {
        i = 1;
        if (c1 >= c2) {
          break label105;
        }
        char c3 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          this.pos = c3;
          return;
        }
        char c4 = '\\';
        if (c1 == c4)
        {
          this.pos = c3;
          readEscapeCharacter();
          break;
        }
        c4 = '\n';
        if (c1 == c4)
        {
          c1 = this.lineNumber + i;
          this.lineNumber = c1;
          this.lineStart = c3;
        }
        c1 = c3;
      }
      this.pos = c1;
      bool = fillBuffer(i);
    } while (bool);
    String str = m54207b69.F54207b69_11("y5605C43534B5D62625C4A5A5C21534F566C6C64");
    throw syntaxError(str);
  }
  
  private boolean skipTo(String paramString)
  {
    int i = paramString.length();
    int j = this.pos + i;
    int m = this.limit;
    int n = 0;
    if (j > m)
    {
      boolean bool = fillBuffer(i);
      if (!bool) {
        return false;
      }
    }
    char[] arrayOfChar = this.buffer;
    m = this.pos;
    int k = arrayOfChar[m];
    int i1 = 10;
    int i2 = 1;
    if (k == i1)
    {
      k = this.lineNumber + i2;
      this.lineNumber = k;
      m += 1;
      this.lineStart = m;
    }
    for (;;)
    {
      if (n >= i) {
        break label167;
      }
      arrayOfChar = this.buffer;
      m = this.pos + n;
      k = arrayOfChar[m];
      m = paramString.charAt(n);
      if (k != m)
      {
        k = this.pos + i2;
        this.pos = k;
        break;
      }
      n += 1;
    }
    label167:
    return i2;
  }
  
  private void skipToEndOfLine()
  {
    int k;
    int j;
    do
    {
      int i = this.pos;
      k = this.limit;
      int m = 1;
      if (i >= k)
      {
        boolean bool = fillBuffer(m);
        if (!bool) {
          break;
        }
      }
      char[] arrayOfChar = this.buffer;
      k = this.pos;
      int n = k + 1;
      this.pos = n;
      j = arrayOfChar[k];
      k = 10;
      if (j == k)
      {
        j = this.lineNumber + m;
        this.lineNumber = j;
        this.lineStart = n;
        break;
      }
      k = 13;
    } while (j != k);
  }
  
  private void skipUnquotedValue()
  {
    label179:
    label192:
    boolean bool;
    do
    {
      int i = 0;
      for (;;)
      {
        j = this.pos;
        int k = j + i;
        int m = this.limit;
        if (k >= m) {
          break label192;
        }
        char[] arrayOfChar = this.buffer;
        j += i;
        j = arrayOfChar[j];
        k = 9;
        if (j == k) {
          break label179;
        }
        k = 10;
        if (j == k) {
          break label179;
        }
        k = 12;
        if (j == k) {
          break label179;
        }
        k = 13;
        if (j == k) {
          break label179;
        }
        k = 32;
        if (j == k) {
          break label179;
        }
        k = 35;
        if (j == k) {
          break;
        }
        k = 44;
        if (j == k) {
          break label179;
        }
        k = 47;
        if (j == k) {
          break;
        }
        k = 61;
        if (j == k) {
          break;
        }
        k = 123;
        if (j == k) {
          break label179;
        }
        k = 125;
        if (j == k) {
          break label179;
        }
        k = 58;
        if (j == k) {
          break label179;
        }
        k = 59;
        if (j == k) {
          break;
        }
        switch (j)
        {
        default: 
          i += 1;
        }
      }
      checkLenient();
      int j = this.pos + i;
      this.pos = j;
      return;
      j += i;
      this.pos = j;
      bool = fillBuffer(1);
    } while (bool);
  }
  
  private IOException syntaxError(String paramString)
  {
    MalformedJsonException localMalformedJsonException = new com/google/gson/stream/MalformedJsonException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    paramString = locationString();
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    localMalformedJsonException.<init>(paramString);
    throw localMalformedJsonException;
  }
  
  public void beginArray()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 3;
    if (i == j)
    {
      i = 1;
      push(i);
      localObject1 = this.pathIndices;
      int k = this.stackSize - i;
      localObject1[k] = 0;
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("\\'626059454858484A0F6E6C6B7A768675858678911B5A686A1F69606F23");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = peek();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = locationString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public void beginObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 1;
    if (i == j)
    {
      push(3);
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("3g222019050818080A4F2E2C2B3A364637353E3437475C1B292B602A213064");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = peek();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = locationString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public void close()
  {
    this.peeked = 0;
    this.stack[0] = 8;
    this.stackSize = 1;
    this.in.close();
  }
  
  public int doPeek()
  {
    Object localObject = this.stack;
    int i = this.stackSize;
    int j = i + -1;
    j = localObject[j];
    int k = 8;
    int m = 39;
    int n = 34;
    int i1 = 93;
    int i2 = 3;
    int i3 = 7;
    int i4 = 59;
    int i5 = 44;
    int i6 = 4;
    int i7 = 2;
    int i8 = 1;
    int i19;
    int i13;
    if (j == i8)
    {
      i -= i8;
      localObject[i] = i7;
    }
    else
    {
      int i9;
      if (j == i7)
      {
        i9 = nextNonWhitespace(i8);
        if (i9 != i5)
        {
          if (i9 != i4)
          {
            if (i9 == i1)
            {
              this.peeked = i6;
              return i6;
            }
            localObject = m54207b69.F54207b69_11("O\\09332A3C32363B3945314343884A3C3D4D36");
            throw syntaxError((String)localObject);
          }
          checkLenient();
        }
      }
      else
      {
        int i18 = 5;
        if ((j == i2) || (j == i18)) {
          break label682;
        }
        int i11;
        if (j == i6)
        {
          i -= i8;
          localObject[i] = i18;
          i9 = nextNonWhitespace(i8);
          i = 58;
          if (i9 != i)
          {
            i = 61;
            if (i9 == i)
            {
              checkLenient();
              int i10 = this.pos;
              i = this.limit;
              if (i10 >= i)
              {
                boolean bool1 = fillBuffer(i8);
                if (!bool1) {}
              }
              else
              {
                localObject = this.buffer;
                i = this.pos;
                i11 = localObject[i];
                i19 = 62;
                if (i11 == i19)
                {
                  i += i8;
                  this.pos = i;
                }
              }
            }
            else
            {
              localObject = m54207b69.F54207b69_11("iD013D36242B3527276C6C886E");
              throw syntaxError((String)localObject);
            }
          }
        }
        else
        {
          i11 = 6;
          if (j == i11)
          {
            boolean bool2 = this.lenient;
            if (bool2) {
              consumeNonExecutePrefix();
            }
            localObject = this.stack;
            i = this.stackSize - i8;
            localObject[i] = i3;
          }
          else if (j == i3)
          {
            localObject = null;
            int i12 = nextNonWhitespace(false);
            i = -1;
            if (i12 == i) {
              i13 = 17;
            }
          }
        }
      }
    }
    for (;;)
    {
      this.peeked = i13;
      return i13;
      checkLenient();
      i13 = this.pos - i8;
      this.pos = i13;
      int i15;
      if (j != k)
      {
        i13 = nextNonWhitespace(i8);
        if (i13 != n)
        {
          if (i13 != m)
          {
            if ((i13 != i5) && (i13 != i4))
            {
              i = 91;
              if (i13 != i)
              {
                if (i13 != i1)
                {
                  i = 123;
                  if (i13 != i)
                  {
                    int i14 = this.pos - i8;
                    this.pos = i14;
                    i14 = peekKeyword();
                    if (i14 != 0) {
                      return i14;
                    }
                    i14 = peekNumber();
                    if (i14 != 0) {
                      return i14;
                    }
                    localObject = this.buffer;
                    i = this.pos;
                    i14 = localObject[i];
                    boolean bool3 = isLiteral(i14);
                    if (bool3)
                    {
                      checkLenient();
                      i15 = 10;
                      continue;
                    }
                    localObject = m54207b69.F54207b69_11("[U102E27333A2636387D2C3E442C3D");
                    throw syntaxError((String)localObject);
                  }
                  this.peeked = i8;
                  return i8;
                }
                if (j == i8)
                {
                  this.peeked = i6;
                  return i6;
                }
              }
              else
              {
                this.peeked = i2;
                return i2;
              }
            }
            if ((j != i8) && (j != i7))
            {
              localObject = m54207b69.F54207b69_11("Kc360E081E170B061E0E104D200E1C2415");
              throw syntaxError((String)localObject);
            }
            checkLenient();
            i15 = this.pos - i8;
            this.pos = i15;
            this.peeked = i3;
            return i3;
          }
          else
          {
            checkLenient();
            this.peeked = k;
            return k;
          }
        }
        else {
          i15 = 9;
        }
      }
      else
      {
        localObject = new java/lang/IllegalStateException;
        String str1 = m54207b69.F54207b69_11("HV1C263B3B08383D393B2D804A3183434949364545");
        ((IllegalStateException)localObject).<init>(str1);
        throw ((Throwable)localObject);
        label682:
        i -= i8;
        localObject[i] = i6;
        i15 = 125;
        if (j == i19)
        {
          i = nextNonWhitespace(i8);
          if (i != i5)
          {
            if (i != i4)
            {
              if (i == i15)
              {
                this.peeked = i7;
                return i7;
              }
              localObject = m54207b69.F54207b69_11("GW023A2535293F44403E2C3C3E8345434C424535");
              throw syntaxError((String)localObject);
            }
            checkLenient();
          }
        }
        i = nextNonWhitespace(i8);
        int i17;
        if (i != n)
        {
          if (i != m)
          {
            String str2 = m54207b69.F54207b69_11("rZ1F232C423D334545823D45424B");
            if (i != i15)
            {
              checkLenient();
              int i16 = this.pos - i8;
              this.pos = i16;
              i16 = (char)i;
              boolean bool4 = isLiteral(i16);
              if (bool4) {
                i17 = 14;
              } else {
                throw syntaxError(str2);
              }
            }
            else
            {
              if (j != i19)
              {
                this.peeked = i7;
                return i7;
              }
              throw syntaxError(str2);
            }
          }
          else
          {
            checkLenient();
            i17 = 12;
          }
        }
        else {
          i17 = 13;
        }
      }
    }
  }
  
  public void endArray()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 4;
    if (i == j)
    {
      i = this.stackSize + -1;
      this.stackSize = i;
      localObject1 = this.pathIndices;
      i += -1;
      int k = localObject1[i] + 1;
      localObject1[i] = k;
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("T^1B27303E412F414186241A250D2C1A1B2F18904F3F3F9440574698");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = peek();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = locationString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public void endObject()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 2;
    if (i == j)
    {
      i = this.stackSize + -1;
      this.stackSize = i;
      this.pathNames[i] = null;
      localObject1 = this.pathIndices;
      i += -1;
      int k = localObject1[i] + 1;
      localObject1[i] = k;
      this.peeked = 0;
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("IG024039252838282A6F0B130E2415131C1215257A3947497E483F4E82");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = peek();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = locationString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
  
  public String getPath()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('$');
    int i = this.stackSize;
    int j = 0;
    while (j < i)
    {
      Object localObject = this.stack;
      int k = localObject[j];
      int n = 1;
      if (k != n)
      {
        int i1 = 2;
        if (k != i1)
        {
          int i2 = 3;
          if (k != i2)
          {
            int i3 = 4;
            if (k != i3)
            {
              int i4 = 5;
              if (k != i4) {
                break label163;
              }
            }
          }
          k = 46;
          localStringBuilder.append(k);
          localObject = this.pathNames[j];
          if (localObject == null) {
            break label163;
          }
          localStringBuilder.append((String)localObject);
          break label163;
        }
      }
      localStringBuilder.append('[');
      localObject = this.pathIndices;
      int m = localObject[j];
      localStringBuilder.append(m);
      m = 93;
      localStringBuilder.append(m);
      label163:
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  public boolean hasNext()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 2;
    if (i != j)
    {
      int k = 4;
      if (i != k) {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  public final boolean isLenient()
  {
    return this.lenient;
  }
  
  public String locationString()
  {
    int i = this.lineNumber + 1;
    int j = this.pos;
    int k = this.lineStart;
    j = j - k + 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("qc43031946130F130D4B");
    localStringBuilder.append(str1);
    localStringBuilder.append(i);
    String str2 = m54207b69.F54207b69_11("@K6B29262A422B2B72");
    localStringBuilder.append(str2);
    localStringBuilder.append(j);
    str2 = m54207b69.F54207b69_11("-(08594B5F440D");
    localStringBuilder.append(str2);
    str2 = getPath();
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public boolean nextBoolean()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 5;
    int k = 0;
    Object localObject1 = null;
    int m = 1;
    if (i == j)
    {
      this.peeked = 0;
      localObject2 = this.pathIndices;
      j = this.stackSize - m;
      k = localObject2[j] + m;
      localObject2[j] = k;
      return m;
    }
    j = 6;
    if (i == j)
    {
      this.peeked = 0;
      localObject2 = this.pathIndices;
      j = this.stackSize - m;
      int n = localObject2[j] + m;
      localObject2[j] = n;
      return false;
    }
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = m54207b69.F54207b69_11("K=78464F5B624E5E602565276A5E5F5F676C642F725C5E3361746737");
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = peek();
    ((StringBuilder)localObject3).append(localObject1);
    localObject1 = locationString();
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject3 = ((StringBuilder)localObject3).toString();
    ((IllegalStateException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public double nextDouble()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 15;
    int i2 = 0;
    Object localObject1 = null;
    if (i == j)
    {
      this.peeked = 0;
      localObject2 = this.pathIndices;
      k = this.stackSize + -1;
      i2 = localObject2[k] + 1;
      localObject2[k] = i2;
      return this.peekedLong;
    }
    int k = 16;
    int i3 = 11;
    Object localObject3;
    int i5;
    if (i == k)
    {
      localObject2 = new java/lang/String;
      localObject3 = this.buffer;
      i5 = this.pos;
      int i7 = this.peekedNumberLength;
      ((String)localObject2).<init>((char[])localObject3, i5, i7);
      this.peekedString = ((String)localObject2);
      i = this.pos;
      int m = this.peekedNumberLength;
      i += m;
      this.pos = i;
    }
    else
    {
      int n = 8;
      int i1;
      if (i != n)
      {
        i5 = 9;
        if (i != i5)
        {
          i1 = 10;
          if (i == i1)
          {
            localObject2 = nextUnquotedValue();
            break label281;
          }
          if (i == i3) {
            break label287;
          }
          localObject2 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject1 = m54207b69.F54207b69_11("`p3509021817091B1B581A5A1F2B12202B2561241818651D281B69");
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject1 = peek();
          ((StringBuilder)localObject3).append(localObject1);
          localObject1 = locationString();
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
      }
      if (i == i1) {
        i = 39;
      } else {
        i = 34;
      }
      localObject2 = nextQuotedValue(i);
      label281:
      this.peekedString = ((String)localObject2);
    }
    label287:
    this.peeked = i3;
    Object localObject2 = this.peekedString;
    double d = Double.parseDouble((String)localObject2);
    boolean bool = this.lenient;
    if (!bool)
    {
      bool = Double.isNaN(d);
      if (!bool)
      {
        bool = Double.isInfinite(d);
        if (!bool) {}
      }
      else
      {
        localObject1 = new com/google/gson/stream/MalformedJsonException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = m54207b69.F54207b69_11("/<76707575205F5955665E625A287F6B812C6E646B306A68716D6B6F6371766D253C");
        localStringBuilder.append(str);
        localStringBuilder.append(d);
        localObject2 = locationString();
        localStringBuilder.append((String)localObject2);
        localObject2 = localStringBuilder.toString();
        ((MalformedJsonException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    this.peekedString = null;
    this.peeked = 0;
    localObject1 = this.pathIndices;
    int i4 = this.stackSize + -1;
    int i6 = localObject1[i4] + 1;
    localObject1[i4] = i6;
    return d;
  }
  
  public int nextInt()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int n = 15;
    Object localObject1 = m54207b69.F54207b69_11("+e201E17030A1606084D0D155018181F541721235826192C5C");
    int i4;
    int j;
    int i6;
    if (i == n)
    {
      long l1 = this.peekedLong;
      i4 = (int)l1;
      long l2 = i4;
      j = l1 < l2;
      if (j == 0)
      {
        this.peeked = 0;
        localObject2 = this.pathIndices;
        n = this.stackSize + -1;
        i6 = localObject2[n] + 1;
        localObject2[n] = i6;
        return i4;
      }
      localObject2 = new java/lang/NumberFormatException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append((String)localObject1);
      long l3 = this.peekedLong;
      ((StringBuilder)localObject3).append(l3);
      localObject1 = locationString();
      ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((NumberFormatException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    n = 16;
    int i7;
    int k;
    if (j == n)
    {
      localObject2 = new java/lang/String;
      localObject3 = this.buffer;
      i4 = this.pos;
      i7 = this.peekedNumberLength;
      ((String)localObject2).<init>((char[])localObject3, i4, i7);
      this.peekedString = ((String)localObject2);
      k = this.pos;
      int i1 = this.peekedNumberLength;
      k += i1;
      this.pos = k;
    }
    else
    {
      int i2 = 10;
      i4 = 8;
      if (k != i4)
      {
        i7 = 9;
        if ((k != i7) && (k != i2))
        {
          localObject2 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject1 = peek();
          ((StringBuilder)localObject3).append(localObject1);
          localObject1 = locationString();
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
      }
      if (k == i2) {}
      for (localObject2 = nextUnquotedValue();; localObject2 = nextQuotedValue(k))
      {
        this.peekedString = ((String)localObject2);
        break;
        if (k == i4) {
          k = 39;
        } else {
          k = 34;
        }
      }
      try
      {
        localObject2 = this.peekedString;
        int m = Integer.parseInt((String)localObject2);
        this.peeked = 0;
        localObject3 = this.pathIndices;
        i5 = this.stackSize + -1;
        int i8 = localObject3[i5] + 1;
        localObject3[i5] = i8;
        return m;
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
    this.peeked = 11;
    Object localObject2 = this.peekedString;
    double d1 = Double.parseDouble((String)localObject2);
    int i5 = (int)d1;
    double d2 = i5;
    boolean bool = d2 < d1;
    if (!bool)
    {
      this.peekedString = null;
      this.peeked = 0;
      localObject2 = this.pathIndices;
      int i3 = this.stackSize + -1;
      i6 = localObject2[i3] + 1;
      localObject2[i3] = i6;
      return i5;
    }
    localObject2 = new java/lang/NumberFormatException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = this.peekedString;
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = locationString();
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject3 = ((StringBuilder)localObject3).toString();
    ((NumberFormatException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public long nextLong()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 15;
    int i2 = 0;
    Object localObject1 = null;
    if (i == j)
    {
      this.peeked = 0;
      localObject2 = this.pathIndices;
      k = this.stackSize + -1;
      i2 = localObject2[k] + 1;
      localObject2[k] = i2;
      return this.peekedLong;
    }
    int k = 16;
    String str = m54207b69.F54207b69_11("ZT112D26343B2537377C3E7E434747418346323287374A3D8B");
    int i3;
    int i4;
    if (i == k)
    {
      localObject2 = new java/lang/String;
      localObject3 = this.buffer;
      i3 = this.pos;
      i4 = this.peekedNumberLength;
      ((String)localObject2).<init>((char[])localObject3, i3, i4);
      this.peekedString = ((String)localObject2);
      i = this.pos;
      int m = this.peekedNumberLength;
      i += m;
      this.pos = i;
    }
    else
    {
      int n = 10;
      i3 = 8;
      if (i != i3)
      {
        i4 = 9;
        if ((i != i4) && (i != n))
        {
          localObject2 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append(str);
          localObject1 = peek();
          ((StringBuilder)localObject3).append(localObject1);
          localObject1 = locationString();
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((IllegalStateException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
      }
      if (i == n) {}
      for (localObject2 = nextUnquotedValue();; localObject2 = nextQuotedValue(i))
      {
        this.peekedString = ((String)localObject2);
        break;
        if (i == i3) {
          i = 39;
        } else {
          i = 34;
        }
      }
      try
      {
        localObject2 = this.peekedString;
        long l1 = Long.parseLong((String)localObject2);
        this.peeked = 0;
        int[] arrayOfInt = this.pathIndices;
        int i5 = this.stackSize + -1;
        int i6 = arrayOfInt[i5] + 1;
        arrayOfInt[i5] = i6;
        return l1;
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
    this.peeked = 11;
    Object localObject2 = this.peekedString;
    double d1 = Double.parseDouble((String)localObject2);
    long l2 = d1;
    double d2 = l2;
    boolean bool = d2 < d1;
    if (!bool)
    {
      this.peekedString = null;
      this.peeked = 0;
      localObject2 = this.pathIndices;
      int i1 = this.stackSize + -1;
      i2 = localObject2[i1] + 1;
      localObject2[i1] = i2;
      return l2;
    }
    localObject2 = new java/lang/NumberFormatException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append(str);
    localObject1 = this.peekedString;
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = locationString();
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject3 = ((StringBuilder)localObject3).toString();
    ((NumberFormatException)localObject2).<init>((String)localObject3);
    throw ((Throwable)localObject2);
  }
  
  public String nextName()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int k = 14;
    if (i == k)
    {
      localObject1 = nextUnquotedValue();
    }
    else
    {
      int m = 12;
      if (i == m) {}
      int j;
      for (i = 39;; j = 34)
      {
        localObject1 = nextQuotedValue(i);
        break;
        int n = 13;
        if (i != n) {
          break label91;
        }
      }
    }
    this.peeked = 0;
    Object localObject2 = this.pathNames;
    int i1 = this.stackSize + -1;
    localObject2[i1] = localObject1;
    return localObject1;
    label91:
    Object localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("-z3F030C221D1325256224641F27242D692820206D21301F71");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = peek();
    ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void nextNull()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int j = 7;
    if (i == j)
    {
      this.peeked = 0;
      localObject1 = this.pathIndices;
      j = this.stackSize + -1;
      int k = localObject1[j] + 1;
      localObject1[j] = k;
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("WV132F2836392739397E412D45468342323287334A398B");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = peek();
    ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public String nextString()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    int k = 10;
    if (i == k)
    {
      localObject1 = nextUnquotedValue();
    }
    else
    {
      int m = 8;
      if (i == m) {}
      int j;
      for (i = 39;; j = 34)
      {
        localObject1 = nextQuotedValue(i);
        break label174;
        int n = 9;
        if (i != n) {
          break;
        }
      }
      int i1 = 11;
      if (j == i1)
      {
        localObject1 = this.peekedString;
        i1 = 0;
        localObject2 = null;
        this.peekedString = null;
      }
      else
      {
        i1 = 15;
        if (j == i1)
        {
          long l = this.peekedLong;
          localObject1 = Long.toString(l);
        }
        else
        {
          i1 = 16;
          if (j != i1) {
            break label211;
          }
          localObject1 = new java/lang/String;
          localObject2 = this.buffer;
          i2 = this.pos;
          i3 = this.peekedNumberLength;
          ((String)localObject1).<init>((char[])localObject2, i2, i3);
          i1 = this.pos;
          i2 = this.peekedNumberLength;
          i1 += i2;
          this.pos = i1;
        }
      }
    }
    label174:
    this.peeked = 0;
    Object localObject2 = this.pathIndices;
    int i2 = this.stackSize + -1;
    int i3 = localObject2[i2] + 1;
    localObject2[i2] = i3;
    return localObject1;
    label211:
    Object localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("aS162C2539342C3C3E7B3B7D2B332E484C448443393B883A49388C");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = peek();
    ((StringBuilder)localObject2).append(localObject3);
    localObject3 = locationString();
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public JsonToken peek()
  {
    int i = this.peeked;
    if (i == 0) {
      i = doPeek();
    }
    switch (i)
    {
    default: 
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>();
      throw localAssertionError;
    case 17: 
      return JsonToken.END_DOCUMENT;
    case 15: 
    case 16: 
      return JsonToken.NUMBER;
    case 12: 
    case 13: 
    case 14: 
      return JsonToken.NAME;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return JsonToken.STRING;
    case 7: 
      return JsonToken.NULL;
    case 5: 
    case 6: 
      return JsonToken.BOOLEAN;
    case 4: 
      return JsonToken.END_ARRAY;
    case 3: 
      return JsonToken.BEGIN_ARRAY;
    case 2: 
      return JsonToken.END_OBJECT;
    }
    return JsonToken.BEGIN_OBJECT;
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public void skipValue()
  {
    Object localObject = null;
    int i = 0;
    int i11;
    label211:
    label223:
    do
    {
      int j = this.peeked;
      if (j == 0) {
        j = doPeek();
      }
      int m = 3;
      i11 = 1;
      if (j == m) {
        push(i11);
      }
      for (;;)
      {
        i += 1;
        break label223;
        if (j != i11) {
          break;
        }
        push(m);
      }
      int n = 4;
      if (j == n) {}
      int i1;
      do
      {
        j = this.stackSize - i11;
        this.stackSize = j;
        i += -1;
        break;
        i1 = 2;
      } while (j == i1);
      int i2 = 14;
      if (j != i2)
      {
        int i3 = 10;
        if (j != i3)
        {
          int i4 = 8;
          if (j != i4)
          {
            int i5 = 12;
            if (j != i5)
            {
              int i6 = 9;
              if (j != i6)
              {
                int i7 = 13;
                if (j != i7)
                {
                  int i8 = 16;
                  if (j != i8) {
                    break label223;
                  }
                  j = this.pos;
                  int i9 = this.peekedNumberLength;
                  j += i9;
                  this.pos = j;
                  break label223;
                }
              }
              j = 34;
              break label211;
            }
          }
          j = 39;
          skipQuotedValue(j);
          break label223;
        }
      }
      skipUnquotedValue();
      this.peeked = 0;
    } while (i != 0);
    localObject = this.pathIndices;
    i = this.stackSize;
    int k = i + -1;
    int i10 = localObject[k] + i11;
    localObject[k] = i10;
    localObject = this.pathNames;
    i -= i11;
    String str = m54207b69.F54207b69_11("C?514B5556");
    localObject[i] = str;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = getClass().getSimpleName();
    localStringBuilder.append(str);
    str = locationString();
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.stream.JsonReader
 * JD-Core Version:    0.7.0.1
 */