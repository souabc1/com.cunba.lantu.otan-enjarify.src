package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import java.util.ArrayList;

public class CLParser
{
  public static boolean OooO0Oo = false;
  public String OooO00o;
  public boolean OooO0O0 = false;
  public int OooO0OO;
  
  public CLParser(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public static CLObject OooO0Oo(String paramString)
  {
    CLParser localCLParser = new androidx/constraintlayout/core/parser/CLParser;
    localCLParser.<init>(paramString);
    return localCLParser.OooO0OO();
  }
  
  public final CLElement OooO00o(CLElement paramCLElement, int paramInt, CLParser.TYPE paramTYPE, boolean paramBoolean, char[] paramArrayOfChar)
  {
    boolean bool = OooO0Oo;
    if (bool)
    {
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("CREATE ");
      ((StringBuilder)localObject2).append(paramTYPE);
      String str = " at ";
      ((StringBuilder)localObject2).append(str);
      char c = paramArrayOfChar[paramInt];
      ((StringBuilder)localObject2).append(c);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
    }
    Object localObject1 = CLParser.1.OooO00o;
    int i = paramTYPE.ordinal();
    i = localObject1[i];
    bool = false;
    localObject1 = null;
    switch (i)
    {
    default: 
      i = 0;
      paramTYPE = null;
      break;
    case 6: 
      paramTYPE = CLToken.OooO0OO(paramArrayOfChar);
      break;
    case 5: 
      paramTYPE = CLKey.OooO0Oo(paramArrayOfChar);
      break;
    case 4: 
      paramTYPE = CLNumber.OooO0OO(paramArrayOfChar);
      break;
    case 3: 
      paramTYPE = CLString.OooO0OO(paramArrayOfChar);
      break;
    case 2: 
      paramTYPE = CLArray.OooO0Oo(paramArrayOfChar);
      break;
    case 1: 
      paramTYPE = CLObject.OooO0Oo(paramArrayOfChar);
    }
    paramInt += 1;
    if (paramTYPE == null) {
      return null;
    }
    int j = this.OooO0OO;
    paramTYPE.setLine(j);
    if (paramBoolean)
    {
      long l = paramInt;
      paramTYPE.setStart(l);
    }
    paramInt = paramCLElement instanceof CLContainer;
    if (paramInt != 0)
    {
      paramCLElement = (CLContainer)paramCLElement;
      paramTYPE.setContainer(paramCLElement);
    }
    return paramTYPE;
  }
  
  public final CLElement OooO0O0(int paramInt, char paramChar, CLElement paramCLElement, char[] paramArrayOfChar)
  {
    char c = '\t';
    if (paramChar != c)
    {
      c = '\n';
      if (paramChar != c)
      {
        c = '\r';
        if (paramChar != c)
        {
          c = ' ';
          if (paramChar != c)
          {
            c = '"';
            if (paramChar != c)
            {
              c = '\'';
              if (paramChar != c)
              {
                c = '[';
                if (paramChar != c)
                {
                  c = ']';
                  if (paramChar != c)
                  {
                    c = '{';
                    if (paramChar != c)
                    {
                      c = '}';
                      if (paramChar == c) {
                        break label432;
                      }
                    }
                  }
                }
              }
            }
            long l1;
            CLParser.TYPE localTYPE2;
            boolean bool3;
            switch (paramChar)
            {
            default: 
              boolean bool1 = paramCLElement instanceof CLContainer;
              if (bool1)
              {
                bool1 = paramCLElement instanceof CLObject;
                if (!bool1)
                {
                  CLParser.TYPE localTYPE1 = CLParser.TYPE.o00OooO;
                  boolean bool2 = true;
                  paramCLElement = OooO00o((CLElement)paramCLElement, paramInt, localTYPE1, bool2, paramArrayOfChar);
                  paramArrayOfChar = paramCLElement;
                  paramArrayOfChar = (CLToken)paramCLElement;
                  l1 = paramInt;
                  paramInt = paramArrayOfChar.OooO0Oo(paramChar, l1);
                  if (paramInt != 0) {
                    break;
                  }
                  CLParsingException localCLParsingException = new androidx/constraintlayout/core/parser/CLParsingException;
                  paramCLElement = new java/lang/StringBuilder;
                  paramCLElement.<init>();
                  paramCLElement.append("incorrect token <");
                  paramCLElement.append(paramChar);
                  paramCLElement.append("> at line ");
                  paramChar = this.OooO0OO;
                  paramCLElement.append(paramChar);
                  String str = paramCLElement.toString();
                  localCLParsingException.<init>(str, paramArrayOfChar);
                  throw localCLParsingException;
                }
              }
              localTYPE2 = CLParser.TYPE.o00OooO0;
              bool3 = true;
              paramCLElement = OooO00o((CLElement)paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              break;
            case '/': 
              paramChar = '\001';
              paramInt += paramChar;
              int i = paramArrayOfChar.length;
              if (paramInt < i)
              {
                paramInt = paramArrayOfChar[paramInt];
                int j = 47;
                if (paramInt == j) {
                  this.OooO0O0 = paramChar;
                }
              }
              break;
            case '+': 
            case '-': 
            case '.': 
            case '0': 
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': 
              localTYPE2 = CLParser.TYPE.o00Ooo0O;
              bool3 = true;
              paramCLElement = OooO00o(paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              break;
              localTYPE2 = CLParser.TYPE.o00Ooo00;
              bool3 = true;
              paramCLElement = OooO00o(paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              break;
              label432:
              paramChar = paramInt + -1;
              l1 = paramChar;
              paramCLElement.setEnd(l1);
              paramCLElement = paramCLElement.getContainer();
              long l2 = paramInt;
              paramCLElement.setEnd(l2);
              break;
              localTYPE2 = CLParser.TYPE.o00Ooo0;
              bool3 = true;
              paramCLElement = OooO00o(paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              break;
              paramChar = paramCLElement instanceof CLObject;
              if (paramChar != 0)
              {
                localTYPE2 = CLParser.TYPE.o00OooO0;
                bool3 = true;
                paramCLElement = OooO00o((CLElement)paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              }
              else
              {
                localTYPE2 = CLParser.TYPE.o00Ooo0o;
                bool3 = true;
                paramCLElement = OooO00o(paramCLElement, paramInt, localTYPE2, bool3, paramArrayOfChar);
              }
              break;
            }
          }
        }
      }
    }
    return paramCLElement;
  }
  
  public CLObject OooO0OO()
  {
    CLParser localCLParser = this;
    Object localObject1 = this.OooO00o.toCharArray();
    int i = localObject1.length;
    int j = 1;
    this.OooO0OO = j;
    int i2 = 0;
    int i3;
    int i4;
    int i5;
    int i6;
    for (;;)
    {
      i3 = 10;
      i4 = -1;
      if (i2 >= i) {
        break;
      }
      i5 = localObject1[i2];
      i6 = 123;
      if (i5 == i6) {
        break label93;
      }
      if (i5 == i3)
      {
        i3 = localCLParser.OooO0OO + j;
        localCLParser.OooO0OO = i3;
      }
      i2 += 1;
    }
    i2 = i4;
    label93:
    if (i2 != i4)
    {
      CLObject localCLObject = CLObject.OooO0Oo((char[])localObject1);
      i5 = localCLParser.OooO0OO;
      localCLObject.setLine(i5);
      long l1 = i2;
      localCLObject.setStart(l1);
      i2 += j;
      Object localObject2 = localCLObject;
      label353:
      label377:
      long l5;
      Object localObject4;
      Object localObject5;
      int i1;
      while (i2 < i)
      {
        i6 = localObject1[i2];
        if (i6 == i3)
        {
          int i8 = localCLParser.OooO0OO + j;
          localCLParser.OooO0OO = i8;
        }
        boolean bool6 = localCLParser.OooO0O0;
        if (bool6)
        {
          if (i6 == i3) {
            localCLParser.OooO0O0 = false;
          }
        }
        else
        {
          if (localObject2 == null) {
            break;
          }
          bool6 = ((CLElement)localObject2).isDone();
          if (bool6) {}
          int i10;
          do
          {
            localObject2 = localCLParser.OooO0O0(i2, i6, (CLElement)localObject2, (char[])localObject1);
            break label777;
            bool6 = localObject2 instanceof CLObject;
            i10 = 125;
            if (!bool6) {
              break;
            }
          } while (i6 != i10);
          long l2;
          int i12;
          for (;;)
          {
            break label353;
            bool6 = localObject2 instanceof CLArray;
            int i11 = 93;
            if (bool6)
            {
              if (i6 != i11) {
                break;
              }
              continue;
            }
            bool6 = localObject2 instanceof CLString;
            l2 = 1L;
            if (!bool6) {
              break label377;
            }
            long l3 = ((CLElement)localObject2).o00Ooo00;
            i12 = (int)l3;
            i12 = localObject1[i12];
            if (i12 != i6) {
              break label777;
            }
            l3 += l2;
            ((CLElement)localObject2).setStart(l3);
          }
          int i7 = i2 + -1;
          long l4 = i7;
          ((CLElement)localObject2).setEnd(l4);
          break label777;
          boolean bool7 = localObject2 instanceof CLToken;
          if (bool7)
          {
            Object localObject3 = localObject2;
            localObject3 = (CLToken)localObject2;
            l5 = i2;
            boolean bool1 = ((CLToken)localObject3).OooO0Oo(i7, l5);
            if (!bool1)
            {
              localObject1 = new androidx/constraintlayout/core/parser/CLParsingException;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("parsing incorrect token ");
              localObject5 = ((CLElement)localObject3).OooO00o();
              ((StringBuilder)localObject4).append((String)localObject5);
              ((StringBuilder)localObject4).append(" at line ");
              int k = localCLParser.OooO0OO;
              ((StringBuilder)localObject4).append(k);
              localObject4 = ((StringBuilder)localObject4).toString();
              ((CLParsingException)localObject1).<init>((String)localObject4, (CLElement)localObject3);
              throw ((Throwable)localObject1);
            }
          }
          boolean bool2 = localObject2 instanceof CLKey;
          if ((bool2) || (bool6))
          {
            l5 = ((CLElement)localObject2).o00Ooo00;
            int i9 = (int)l5;
            i9 = localObject1[i9];
            int i13 = 39;
            if (i9 != i13)
            {
              int i14 = 34;
              if (i9 != i14) {}
            }
            else if (i9 == i7)
            {
              l5 += l2;
              ((CLElement)localObject2).setStart(l5);
              int m = i2 + -1;
              l5 = m;
              ((CLElement)localObject2).setEnd(l5);
            }
          }
          boolean bool3 = ((CLElement)localObject2).isDone();
          if (!bool3)
          {
            if ((i7 != i10) && (i7 != i12))
            {
              n = 44;
              if (i7 != n)
              {
                n = 32;
                if (i7 != n)
                {
                  n = 9;
                  if (i7 != n)
                  {
                    n = 13;
                    if ((i7 != n) && (i7 != i3))
                    {
                      n = 58;
                      if (i7 != n) {
                        break label777;
                      }
                    }
                  }
                }
              }
            }
            int n = i2 + -1;
            l5 = n;
            ((CLElement)localObject2).setEnd(l5);
            if ((i7 == i10) || (i7 == i12))
            {
              localObject2 = ((CLElement)localObject2).getContainer();
              ((CLElement)localObject2).setEnd(l5);
              boolean bool5 = localObject2 instanceof CLKey;
              if (bool5)
              {
                localObject2 = ((CLElement)localObject2).getContainer();
                ((CLElement)localObject2).setEnd(l5);
              }
            }
          }
          boolean bool4 = ((CLElement)localObject2).isDone();
          if (bool4)
          {
            bool4 = localObject2 instanceof CLKey;
            if (bool4)
            {
              localObject5 = localObject2;
              localObject5 = ((CLKey)localObject2).o00OooO0;
              i1 = ((ArrayList)localObject5).size();
              if (i1 <= 0) {}
            }
            else
            {
              localObject2 = ((CLElement)localObject2).getContainer();
            }
          }
        }
        i2 += 1;
        i1 = 1;
      }
      while (localObject2 != null)
      {
        boolean bool8 = ((CLElement)localObject2).isDone();
        if (bool8) {
          break;
        }
        bool8 = localObject2 instanceof CLString;
        if (bool8)
        {
          l5 = ((CLElement)localObject2).o00Ooo00;
          i15 = (int)l5;
          i1 = 1;
          i15 += i1;
          l6 = i15;
          ((CLElement)localObject2).setStart(l6);
        }
        else
        {
          i1 = 1;
        }
        int i15 = i + -1;
        long l6 = i15;
        ((CLElement)localObject2).setEnd(l6);
        localObject2 = ((CLElement)localObject2).getContainer();
      }
      boolean bool9 = OooO0Oo;
      if (bool9)
      {
        localObject1 = System.out;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append("Root: ");
        localObject5 = localCLObject.OooO0O0();
        ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        ((PrintStream)localObject1).println((String)localObject4);
      }
      return localCLObject;
    }
    label777:
    localObject1 = new androidx/constraintlayout/core/parser/CLParsingException;
    ((CLParsingException)localObject1).<init>("invalid json content", null);
    throw ((Throwable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.parser.CLParser
 * JD-Core Version:    0.7.0.1
 */