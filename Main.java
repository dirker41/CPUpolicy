
import java.io.* ;
import java.util.*;
import java.util.concurrent.CountDownLatch;

abstract class G {
        
  static String OUTPUTSTR = "" ;
  static String sFileName = "out.txt" ; 
  
        
  static void Print( String str ) {
    System.out.print( str );
    // OutputCollect( str ) ;
  } // Print()
  
  static void Println( String str ) {
    System.out.println( str );
    // OutputCollect( ( str + "\r\n" ) ) ;
  } // Println()
  
  static void Println() {
    System.out.println();
    // OutputCollect( "\r\n" ) ;
  } // Println()
  
  static void fPrint( String str ) {
    OutputCollect( str ) ;
  } // Print()
  
  static void fPrintln( String str ) {
    OutputCollect( ( str + "\r\n" ) ) ;
  } // Println()
  
  static void fPrintln() {
    OutputCollect( "\r\n" ) ;
  } // Println()
  
  
  
  static void OutputCollect( String str ) {
        OUTPUTSTR += str ;
  } // OutputCollect()
  
  static void WriteToFile() throws Exception {
        System.out.println( "output file is \"out.txt\"" ) ;
        // InputStreamReader isr = new InputStreamReader( System.in );
        // BufferedReader bf = new BufferedReader( isr );
    
        String fileName = "out.txt";
        
        
        File f = new File( fileName ) ;
        if ( !f.exists() ) f.createNewFile() ;
        FileWriter fp = new FileWriter( f ) ;

        fp.write( OUTPUTSTR ) ;
        fp.flush();
        fp.close();
        
        
        // OUTPUTSTR += str ;
  } // OutputCollect()
  
  
} // Class G



class Process1 {
    int mID ;
    int mCPU_Burst;
    int mArrival_Time ;
    int mPriority ;
    // int mWaiting_Time ;
    int mTurnarround_Time ;
    int mRunTime ;
    
    public Process1( int a,int b ,int c, int d ) {
      mID = a ;
      mCPU_Burst = b ;
      mArrival_Time = c ;
      mPriority  = d ;
      // mWaiting_Time = 0 ;
      mTurnarround_Time = 0 ;
      mRunTime = 0 ;
    } // Process1()
    
    public Process1( Process1 process1 ) {
      mID = process1.mID ;
      mCPU_Burst = process1.mCPU_Burst ;
      mArrival_Time = process1.mArrival_Time ;
      mPriority  = process1.mPriority ;
      // mWaiting_Time = process1.mWaiting_Time ;
      mTurnarround_Time = process1.mTurnarround_Time ;
      mRunTime = process1.mRunTime ;
    } // Process1()
    
    
    public void RunTimeAdd() {
      // G.Print( "\nID: " + mID + " wait: " + mWaiting_Time + " " ) ;
      mRunTime ++ ;
    } // waitAdd()
    
    
    public void TurnAdd() {
      mTurnarround_Time ++ ;
    } // TurnAdd()
    
    
    void Print() {
        String sID = mID + "" ;
        while( sID.length() < 3 ) sID = " " + sID ;
        
        String sCPU_Burst = mCPU_Burst + "" ;
        while( sCPU_Burst.length() < 10 ) sCPU_Burst = " " + sCPU_Burst ;
        
        String sArrival_Time = mArrival_Time + "" ;
        while( sArrival_Time.length() < 10 ) sArrival_Time = " " + sArrival_Time ;
        
        String sPriority = mPriority + "" ;
        while( sPriority.length() < 12 ) sPriority = " " + sPriority ;
        
        
        
      G.Println( sID + " " + sCPU_Burst + " " + sArrival_Time + " " + sPriority ) ;
      G.fPrintln( sID + " " + sCPU_Burst + " " + sArrival_Time + " " + sPriority ) ;
    } // Print
    
    void ExtraPrint() {
        String sID = mID + "" ;
        while( sID.length() < 3 ) sID = " " + sID ;
        
        String sCPU_Burst = mCPU_Burst + "" ;
        while( sCPU_Burst.length() < 10 ) sCPU_Burst = " " + sCPU_Burst ;
        
        String sArrival_Time = mArrival_Time + "" ;
        while( sArrival_Time.length() < 10 ) sArrival_Time = " " + sArrival_Time ;
        
        String sPriority = mPriority + "" ;
        while( sPriority.length() < 12 ) sPriority = " " + sPriority ;
        
        String sWaiting_Time = ( mTurnarround_Time - mCPU_Burst ) + "" ;
        while( sWaiting_Time.length() < 10 ) sWaiting_Time = " " + sWaiting_Time ;
        
        String sTurnarround_Time = mTurnarround_Time + "" ;
        while( sTurnarround_Time.length() < 10 ) sTurnarround_Time = " " + sTurnarround_Time ;
        
        
        
      G.Println( sID + " " + 
                 sCPU_Burst + " " + 
                 sArrival_Time + " " + 
                 sPriority + " " + 
                 sWaiting_Time + " " + 
                 sTurnarround_Time ) ;
      /*           
      G.fPrintln( sID + " " + 
                  sCPU_Burst + " " + 
                  sArrival_Time + " " + 
                  sPriority + " " + 
                  sWaiting_Time + " " + 
                  sTurnarround_Time ) ;
      */
    } // ExtraPrint
    
    
    static void StdPrint( int id , int a, int b ,int c,int d , int e ) {
      String str = "" ;
      str = id + "" ;
      int length = str.length() ;
      
      while ( str.length() < 8 ) {
        str = str + " " ;
      } // while
      
      str += a ;
      
      while ( str.length() < 16 ) {
        str = str + " " ;
      } // while
      
      str += b ;
      
      while ( str.length() < 24 ) {
        str = str + " " ;
      } // while
      
      str += c ;
      
      while ( str.length() < 32 ) {
        str = str + " " ;
      } // while
      
      str += d ;
      
      while ( str.length() < 40 ) {
        str = str + " " ;
      } // while
      
      str += e ;
      
      while ( str.length() < 48 ) {
        str = str + " " ;
      } // while
      
      G.Println( str ) ;
      G.fPrintln( str ) ;
      
    } // StdPrint
    
    
    static String GetPID( int id ) {
        if ( id < 10 ) return id + "" ;
        
        id = id - 10 ;
        
        int A_ASCII = (int) 'A' ;
        
        id =  id + A_ASCII ;
        
        char ch = ( char ) id ;
        
        
        return ch + "" ;
        
    } //GetPID
  
} // class Process1

class CPU {
  // Vector < Process1 > msortList ;
  Vector < Process1 > queue ;
  String mCPU_list = "" ;
  Vector < Process1 > mSortList = new Vector < Process1 > ();
  
  
  public CPU( Vector < Process1 > sortList ) {
      // msortList = sortList ;
      queue = new Vector < Process1 > () ;
      
      for ( int i = 0 ; i < sortList.size() ; i ++ ) {
        mSortList.add( new Process1( sortList.get(i) ) ) ;
      }
      
      
  } // CPU()
  
  
  
  
 
  
  void swap ( int a,int b ) {
        
    
      // Process1 temp = sortList.get( a ) ;
      // sortList.set( a, new Process1( sortList.get( b ) ) ) ;
      // sortList.set( b, new Process1( temp ) ) ;
      
      Process1 temp = mSortList.get( a ) ;
      mSortList.set( a, mSortList.get( b ) ) ;
      mSortList.set( b, temp ) ;
    
  } // swap()
  
  
  void Sort_ID( int head,int tail ) {
        
        boolean flag = true;
        for ( int j = head ; j < tail ; j ++  ) {
          for( int i = head ; i < head + tail - j ; i ++ ) {
	
	if ( mSortList.get(i).mID > mSortList.get( i+1 ).mID ) {
	        swap( i , i+1 ) ;
	        flag = false;
	} // if
	
          } // for
          
          if (flag == true)
            break;
                        
        } // for
        
        
        
  } // Sort_ID()
  
} // CPU


class FCFS extends CPU {
  
  public FCFS( Vector < Process1 > sortList ) {
      
      super( sortList );
      
  } // FCFS()
  
  
  public void run() {
    int Total_time = Main.Total_time ;
    
    
    
    int time = 0 ;
    int index = 0 ;
    boolean CPUidle = true ;
    int runtime = 0 ;
    
    
    while ( time <= Total_time ) {
        while ( true ) {
          if ( index < mSortList.size() &&
               mSortList.get( index ).mArrival_Time == time ) {

            queue.add( mSortList.get( index ) ) ;
            index ++ ;
          } // if 
          else {
            break ;
          } // else 
        } // while // put process in queue ;
        
        /*
        G.Print( "\nat time: '" + time + "' queue is :" ) ;
        for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
        */
        
        
        if ( CPUidle && queue.size() == 0 ) mCPU_list += "-" ;
        else if ( CPUidle && queue.size() > 0 ) { // else if cpu is free and queue is not empty 
          CPUidle = false ;
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == runtime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
          
          
        
        } // else if cpu is free and queue is not empty 
        else if ( !CPUidle ) { // else if cpu is woring 
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == runtime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
        } // else if cpu is woring 
        
        
        
        
      time ++ ;
      /*
      G.Println( "" ) ;
      for ( int i = 0 ; i < mSortList.size() ; i ++ ) {
        mSortList.get(i).ExtraPrint() ;
      }
      */
      
    } // while 
    
    
  } // run 
  
  public void CPU_listPrint() {
    
        
    Sort_ID(0,mSortList.size()-1) ;
    
    G.Println( "==    FCFS==" ) ;
    G.fPrintln( "==    FCFS==" ) ;
    
    if ( mCPU_list.charAt( mCPU_list.length()-1 ) == '-' ) {
      for ( int last = mCPU_list.length()-1 ; last >= 0 ; last -- ) {
        if ( mCPU_list.charAt( last ) != '-' ) {
          mCPU_list = mCPU_list.substring( 0 , last + 1 ) ;
          break ;
        } // if
      } // for
    } // if 
    
    G.Println( mCPU_list ) ;
    G.fPrintln( mCPU_list ) ;
    
  } // CPU_listPrint()
  
  
  
} //FCFS

class RR extends CPU {
  
  public RR( Vector < Process1 > sortList ) {
      
      super( sortList );
      
  } // RR()
  
  
  public void run() {
    int Total_time = Main.Total_time ;
    
    
    
    int time = 0 ;
    int index = 0 ;
    boolean CPUidle = true ;
    int runtime = 0 ;
    Process1 temp = null ;
    
    while ( time <= Total_time ) {
        
        
        
        while ( true ) {
          if ( index < mSortList.size() &&
               mSortList.get( index ).mArrival_Time == time ) {
            
            // insertIndex = index ;
            queue.add( mSortList.get( index ) ) ;
            index ++ ;
          } // if 
          else {
            break ;
          } // else 
        } // while // put process in queue ;
        
        if ( temp != null ) {
          queue.add( temp ) ;
          temp = null ;
        } // if
        
        /*
        G.Print( "\nat time: '" + time + "' queue is :" ) ;
        for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
        */
        
        
        if ( CPUidle && queue.size() == 0 ) mCPU_list += "-" ;
        else if ( CPUidle && queue.size() > 0 ) { // else if cpu is free and queue is not empty 
          CPUidle = false ;
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          else if ( queue.get(0).mRunTime % Main.sTimeSlice == 0 ) {
            runtime = 0 ;
            temp = queue.remove(0) ;
            
            
            
          } // if 
          
          
          
        
        } // else if cpu is free and queue is not empty 
        else if ( !CPUidle ) { // else if cpu is woring 
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          else if ( queue.get(0).mRunTime % Main.sTimeSlice == 0 ) {
            runtime = 0 ;
            temp = queue.remove(0) ;
            
            
            
          } // if 
          
        } // else if cpu is woring 
        
        
        
        
      time ++ ;
      /*
      G.Println( "" ) ;
      for ( int i = 0 ; i < mSortList.size() ; i ++ ) {
        mSortList.get(i).ExtraPrint() ;
      }
      */
      
    } // while 
    
    
  } // run 
  
  public void CPU_listPrint() {
    
        
    Sort_ID(0,mSortList.size()-1) ;
    
    G.Println( "==      RR==" ) ;
    G.fPrintln( "==      RR==" ) ;
    
    if ( mCPU_list.charAt( mCPU_list.length()-1 ) == '-' ) {
      for ( int last = mCPU_list.length()-1 ; last >= 0 ; last -- ) {
        if ( mCPU_list.charAt( last ) != '-' ) {
          mCPU_list = mCPU_list.substring( 0 , last + 1 ) ;
          break ;
        } // if
      } // for
    } // if 
    
    G.Println( mCPU_list ) ;
    G.fPrintln( mCPU_list ) ;
    
    
  } // CPU_listPrint()
  
  
  
} //RR

class PSJF extends CPU { // shortest reamining time first
        
  public PSJF( Vector < Process1 > sortList ) {
      
      super( sortList );
      
  } // PSJF()
  
  
  public void run() {
    int Total_time = Main.Total_time ;
    
    
    
    int time = 0 ;
    int index = 0 ;
    boolean CPUidle = true ;
    int runtime = 0 ;
    
    
    while ( time <= Total_time ) {
        while ( true ) {
          if ( index < mSortList.size() &&
               mSortList.get( index ).mArrival_Time == time ) {

            if ( queue.size() == 0 ) queue.add( mSortList.get( index ) );
            
            else { //
              boolean done = false ; 
              
              
              
              for ( int i = queue.size() - 1 ; i >= 0 && !done ; i -- ) {
                if ( mSortList.get( index ).mCPU_Burst >= ( queue.get(i).mCPU_Burst-queue.get(i).mRunTime ) ) {
                  queue.add( i+1,mSortList.get( index ) );
                  done = true  ;
                } // if
              } // for
              
              
              if ( !done ) queue.add( 0,mSortList.get( index ) );
              
            } // else 
            
            
            index ++ ;
          } // if 
          else {
            break ;
          } // else 
        } // while // put process in queue ;
        
        /*
        G.Print( "\nat time: '" + time + "' CPUidle : "+ CPUidle + " queue is :" ) ;
        for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
        */
        
        
        if ( CPUidle && queue.size() == 0 ) mCPU_list += "-" ;
        else if ( CPUidle && queue.size() > 0 ) { // else if cpu is free and queue is not empty 
          CPUidle = false ;
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
          
          
        
        } // else if cpu is free and queue is not empty 
        else if ( !CPUidle ) { // else if cpu is woring 
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
        } // else if cpu is woring 
        
        
        
        
      time ++ ;
      /*
      G.Println( "" ) ;
      for ( int i = 0 ; i < mSortList.size() ; i ++ ) {
        mSortList.get(i).ExtraPrint() ;
      }
      */
      
    } // while 
    
    
    
  } // run 
  
  public void CPU_listPrint() {
        
    Sort_ID(0,mSortList.size()-1) ;
    G.Println( "==    PSJF==" ) ;
    G.fPrintln( "==    PSJF==" ) ;
    
    if ( mCPU_list.charAt( mCPU_list.length()-1 ) == '-' ) {
      for ( int last = mCPU_list.length()-1 ; last >= 0 ; last -- ) {
        if ( mCPU_list.charAt( last ) != '-' ) {
          mCPU_list = mCPU_list.substring( 0 , last + 1 ) ;
          break ;
        } // if
      } // for
    } // if 
    
    G.Println( mCPU_list ) ;
    G.fPrintln( mCPU_list ) ;
    
  } // CPU_listPrint()
  
} // PSJF

class NPSJF extends CPU {
        
  public NPSJF( Vector < Process1 > sortList ) {
      
      super( sortList );
      
  } // NPSJF()
  
  
  public void run() {
    int Total_time = Main.Total_time ;
    
    
    
    int time = 0 ;
    int index = 0 ;
    boolean CPUidle = true ;
    int runtime = 0 ;
    
    
    while ( time <= Total_time ) {
        while ( true ) {
          if ( index < mSortList.size() &&
               mSortList.get( index ).mArrival_Time == time ) {

            if ( queue.size() == 0 ) queue.add( mSortList.get( index ) );
            
            else if ( !CPUidle ) { //CPU working 
              boolean done = false ; 
              
              
              for ( int i = queue.size() - 1 ; i >= 0 && !done ; i -- ) {
                if ( mSortList.get( index ).mCPU_Burst >= queue.get(i).mCPU_Burst ) {
                  queue.add( i+1,mSortList.get( index ) );
                  done = true  ;
                } // if
              } // for
              
              if ( !done ) queue.add( 1,mSortList.get( index ) );
              
            } // else if CPU working 
            
            else { // cpu is free 
              boolean done = false ; 
              
              
              
              for ( int i = queue.size() - 1 ; i >= 0 && !done ; i -- ) {
                if ( mSortList.get( index ).mCPU_Burst >= queue.get(i).mCPU_Burst ) {
                  queue.add( i+1,mSortList.get( index ) );
                  done = true  ;
                } // if
              } // for
              
              
              if ( !done ) queue.add( 0,mSortList.get( index ) );
              
            } // else 
            
            
            index ++ ;
          } // if 
          else {
            break ;
          } // else 
        } // while // put process in queue ;
        
        /*
        G.Print( "\nat time: '" + time + "' CPUidle : "+ CPUidle + " queue is :" ) ;
        for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
        */
        
        
        if ( CPUidle && queue.size() == 0 ) mCPU_list += "-" ;
        else if ( CPUidle && queue.size() > 0 ) { // else if cpu is free and queue is not empty 
          CPUidle = false ;
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == runtime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
          
          
        
        } // else if cpu is free and queue is not empty 
        else if ( !CPUidle ) { // else if cpu is woring 
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == runtime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          
        } // else if cpu is woring 
        
        
        
        
      time ++ ;
      /*
      G.Println( "" ) ;
      for ( int i = 0 ; i < mSortList.size() ; i ++ ) {
        mSortList.get(i).ExtraPrint() ;
      }
      */
      
    } // while 
    
    
    
  } // run 
  
  public void CPU_listPrint() {
        
    Sort_ID(0,mSortList.size()-1) ;
    G.Println( "==Non-PSJF==" ) ;
    G.fPrintln( "==Non-PSJF==" ) ;
    
    if ( mCPU_list.charAt( mCPU_list.length()-1 ) == '-' ) {
      for ( int last = mCPU_list.length()-1 ; last >= 0 ; last -- ) {
        if ( mCPU_list.charAt( last ) != '-' ) {
          mCPU_list = mCPU_list.substring( 0 , last + 1 ) ;
          break ;
        } // if
      } // for
    } // if 
    
    G.Println( mCPU_list ) ;
    G.fPrintln( mCPU_list ) ;
    
    
  } // CPU_listPrint()
  
} // NPSJF

class Priority extends CPU { // preemptive
        
  public Priority( Vector < Process1 > sortList ) {
      
      super( sortList );
      
  } // NPSJF()
  
  
  public void run() {
    int Total_time = Main.Total_time ;
    
    
    
    int time = 0 ;
    int index = 0 ;
    boolean CPUidle = true ;
    int runtime = 0 ;
    
    
    while ( time <= Total_time ) {
        while ( true ) {
          if ( index < mSortList.size() &&
               mSortList.get( index ).mArrival_Time == time ) {

            if ( queue.size() == 0 ) queue.add( mSortList.get( index ) );
            
            else { 
              boolean done = false ; 
              
              
              for ( int i = queue.size() - 1 ; i >= 0 && !done ; i -- ) {
                if ( mSortList.get( index ).mPriority >= queue.get(i).mPriority && 
                     queue.get(i).mRunTime == 0 ) {
                  queue.add( i+1,mSortList.get( index ) ) ;
                  done = true  ;
                } // if
                else if ( mSortList.get( index ).mPriority > queue.get(i).mPriority ) {
                  queue.add( i+1,mSortList.get( index ) ) ;
                  done = true  ;
                } // else if
                
                
              } // for
              
              if ( !done ) queue.add( 0,mSortList.get( index ) );
              
            } // else if 
            
            
            
            index ++ ;
          } // if 
          else {
            break ;
          } // else 
        } // while // put process in queue ;
        
        /*
        G.Print( "\nat time: '" + time + "' CPUidle : "+ CPUidle + " queue is :" ) ;
        for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
        */
        
        
        if ( CPUidle && queue.size() == 0 ) mCPU_list += "-" ;
        else if ( CPUidle && queue.size() > 0 ) { // else if cpu is free and queue is not empty 
          CPUidle = false ;
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          else if (  queue.size() > 1 &&
                     queue.get(0).mPriority == queue.get(1).mPriority ) {
            
          int head = 0 ;
          int tail = queue.size()-1 ;
          
          
          // sort
          boolean flag = true;
            
          for ( int jj = head ; jj < tail ; jj ++  ) {
            for( int ii = head ; ii < head + tail - jj ; ii ++ ) {
	
	if ( queue.get(ii).mPriority == queue.get(ii + 1 ).mPriority &&
	     queue.get(ii).mRunTime > 0 && 
	     queue.get( ii+1 ).mRunTime == 0 ) {
	        swap( queue,ii , ii+1 ) ;
	        flag = false;
	} // if
	
              } // for
          
              if (flag == true)
              break;
                        
          } // for
          // sort 
          /*  
          G.Print( "\nat time: '" + time + "' CPUidle : "+ CPUidle + " sorted queue is :" ) ;
          for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
          */
          
          } // else if 
        
        } // else if cpu is free and queue is not empty 
        else if ( !CPUidle ) { // else if cpu is woring 
          mCPU_list += Process1.GetPID( queue.get(0).mID ) ;
          queue.get(0).RunTimeAdd() ;
          
          
          
          
          for ( int i = 0 ; i < queue.size() ; i ++ ) {
            
            queue.get(i).TurnAdd() ;
          } // for 
          runtime ++ ;
          
          if ( queue.get(0).mCPU_Burst == queue.get(0).mRunTime ) {
            runtime = 0 ;
            queue.remove(0) ;
            
            CPUidle = true ;
            
          } // if 
          else if ( queue.size() > 1 &&
                    queue.get(0).mPriority == queue.get(1).mPriority ) {
            int head = 0 ;
            int tail = queue.size()-1 ;
            
            // sort
            boolean flag = true;
            
            for ( int jj = head ; jj < tail ; jj ++  ) {
              for( int ii = head ; ii < head + tail - jj ; ii ++ ) {
	
	if ( queue.get(ii).mPriority == queue.get(ii + 1 ).mPriority &&
	     queue.get(ii).mRunTime > 0 && 
	     queue.get( ii+1 ).mRunTime == 0 ) {
	        swap( queue,ii , ii+1 ) ;
	        flag = false;
	} // if
	
              } // for
          
              if (flag == true)
              break;
                        
            } // for
          // sort 
          /*
          G.Print( "\nat time: '" + time + "' CPUidle : "+ CPUidle + " sorted queue is :" ) ;
          for ( int i = 0 ; i < queue.size() ; i ++ ) G.Print( queue.get(i).mID + " " ) ;
          */
          
          } // else if
          
        } // else if cpu is woring 
        
        
        
        
      time ++ ;
      /*
      G.Println( "" ) ;
      for ( int i = 0 ; i < mSortList.size() ; i ++ ) {
        mSortList.get(i).ExtraPrint() ;
      }
      */
      
    } // while 
    
    
    
  } // run 
  
  public void CPU_listPrint() {
        
    Sort_ID(0,mSortList.size()-1) ;
    G.Println( "== Priority==" ) ;
    G.fPrintln( "== Priority==" ) ;
    
    if ( mCPU_list.charAt( mCPU_list.length()-1 ) == '-' ) {
      for ( int last = mCPU_list.length()-1 ; last >= 0 ; last -- ) {
        if ( mCPU_list.charAt( last ) != '-' ) {
          mCPU_list = mCPU_list.substring( 0 , last + 1 ) ;
          break ;
        } // if
      } // for
    } // if 
    
    G.Println( mCPU_list ) ;
    G.fPrintln( mCPU_list ) ;
    
    
  } // CPU_listPrint()
  
  void swap ( Vector < Process1 > SortList,int a,int b ) {
        
    
      // Process1 temp = sortList.get( a ) ;
      // sortList.set( a, new Process1( sortList.get( b ) ) ) ;
      // sortList.set( b, new Process1( temp ) ) ;
      
      Process1 temp = SortList.get( a ) ;
      SortList.set( a, SortList.get( b ) ) ;
      SortList.set( b, temp ) ;
    
  } // swap()
  
} // Priority



class Main {  // Please do not put 'public' before 'class'

  
  static Vector < Process1 > sortList = new Vector < Process1 > ();
  
  static int sMethod = -1 ;
  static int sTimeSlice = -1 ;
  static int Total_time = 0 ;
  
  static void swap ( int a,int b ) {
        
    
      // Process1 temp = sortList.get( a ) ;
      // sortList.set( a, new Process1( sortList.get( b ) ) ) ;
      // sortList.set( b, new Process1( temp ) ) ;
      
      Process1 temp = sortList.get( a ) ;
      sortList.set( a, sortList.get( b ) ) ;
      sortList.set( b, temp ) ;
    
  } // swap()
  
  static void Sort_ArriveTime( int head,int tail ) {
        
        boolean flag = true;
        for ( int j = head ; j < tail ; j ++  ) {
          for( int i = head ; i < head + tail - j ; i ++ ) {
	
	if ( sortList.get(i).mArrival_Time > sortList.get( i+1 ).mArrival_Time ) {
	        swap( i , i+1 ) ;
	        flag = false;
	} // if
	
          } // for
          
          if (flag == true)
            break;
                        
        } // for
        
        
        
  } // Sort_ArriveTime()
  
  static void Sort_ID( int head,int tail ) {
        
        boolean flag = true;
        for ( int j = head ; j < tail ; j ++  ) {
          for( int i = head ; i < head + tail - j ; i ++ ) {
	
	if ( sortList.get(i).mID > sortList.get( i+1 ).mID ) {
	        swap( i , i+1 ) ;
	        flag = false;
	} // if
	
          } // for
          
          if (flag == true)
            break;
                        
        } // for
        
        
        
  } // Sort_ID()
  
  static void ListPrint( Vector < Process1 > sortList ) {
        
        G.Println( "\n ID     CPU Burst  Arrival Time   Priority" ) ;
        // G.fPrintln( "\n ID     CPU Burst  Arrival Time   Priority" ) ;
        for ( int i = 0 ; i < sortList.size() ; i ++ )
          sortList.get( i ).ExtraPrint() ;
      
  } // ListPrint
  
  
  static int indexOfFirstWhite( String str ) {
        str =str.trim() ;
        
        int space_index = str.indexOf( " " ) ;
        int tab_index = str.indexOf( "\t" ) ;
        
        if ( space_index == -1 && tab_index == -1 ) return -1 ;
        if ( space_index == -1 ) return tab_index ;
        if ( tab_index == -1 ) return space_index ;
        
        if ( space_index < tab_index ) return space_index ;
        else return tab_index ;
        
        
  } // indexOfFirstWhite

  public static boolean GetInput() throws Exception {
    InputStreamReader isr = new InputStreamReader( System.in );
    BufferedReader bf = new BufferedReader( isr );
    String fileName = "" ;
    
    System.out.println( "Enter a file name to read:" ) ;
    fileName = bf.readLine();
    // fileName = "input.txt";
    
    
    File file = new File( fileName ) ;
    
    if ( !file.exists() ) {
        G.Println( fileName + "not found!" ) ;
        return false ;
    } // if
    
    FileInputStream FIS = new FileInputStream( file ) ;
    
    DataInputStream DIS = new DataInputStream ( FIS );
    
    
    
    try {
        String line = "" ;
        line = DIS.readLine();
        
        int index = indexOfFirstWhite( line ) ;
        if ( index == -1 ) {
	G.Println( "there is an error :\"" + line + "\"" ) ;
                System.exit( 0 ) ;
        }
        
        
        
        
        try {
	sMethod = Integer.parseInt( line.substring(0,index).trim() ) ;
	sTimeSlice = Integer.parseInt( line.substring( index,line.length() ).trim() ) ;

              } catch (Exception e) { //try catch
                
                G.Println( "there is an error :\"" + line + "\"" ) ;
                System.exit( 0 ) ;
              } // catch
        
        
        DIS.readLine(); // eat ID     CPU Burst  Arrival Time   Priority
        
        
        
        while( line != null ) { // every line ;
          line = DIS.readLine();
          
          if ( line != null ) {
            int ID = -1 ;
            int CPU_Burst = -1 ;
            int Arrival_Time = -1 ;
            int Priority = -1 ;
            
            
            
            try{
	line = line.trim() ;
	ID = Integer.parseInt( line.substring( 0, indexOfFirstWhite( line ) ) ) ;
	line = line.substring( indexOfFirstWhite( line ),line.length() ).trim() ;
	
	CPU_Burst = Integer.parseInt( line.substring( 0, indexOfFirstWhite( line ) ) ) ;
	line = line.substring( indexOfFirstWhite( line ),line.length() ).trim() ;
	
	Arrival_Time = Integer.parseInt( line.substring( 0, indexOfFirstWhite( line ) ) ) ;
	line = line.substring( indexOfFirstWhite( line ),line.length() ).trim() ;
	
	Priority = Integer.parseInt( line.substring( 0, line.length() ) ) ;
	
            } catch (Exception e) { 
	G.Println( "trans Error :\"" + line + "\"" ) ;
                System.exit( 0 ) ;
            } //catch
            
            sortList.add( new Process1( ID , CPU_Burst, Arrival_Time , Priority ) ) ;
          } // if
          
          
          // sortList.get( sortList.size() - 1 ).Print() ;
          
        } // while
        
        
    } catch ( Exception e ) {
    } // catch()
    
    DIS.close();
    FIS.close();
    
    return true ;
    
  } // GetInput()

  
  public static void main( String[] args ) throws Throwable {
    
    
    
    
    
    if ( !GetInput() ) return ;
    
    G.Println( "Method: " + sMethod ) ;
    G.Println( "time slice: " + sTimeSlice ) ;
    
    Sort_ArriveTime( 0 ,sortList.size()-1 ) ;
    
    int lastArrive = -1 ;
    
    // compute MAX cpu time
    for ( int i = 0 ; i < sortList.size() ; i ++ ) {
      Total_time += sortList.get(i).mCPU_Burst;
      if ( sortList.get(i).mArrival_Time > lastArrive ) lastArrive = sortList.get(i).mArrival_Time ;
    } // for 
    
    Total_time = Total_time + lastArrive ;
    // compute MAX cpu time
    G.Println( "Total_time: " + Total_time ) ;
    
    ListPrint( sortList ) ;
    
    FCFS fcfs = new FCFS( sortList ) ;
    fcfs.run();
    fcfs.CPU_listPrint() ;
    
    RR rr = new RR( sortList ) ;
    rr.run();
    rr.CPU_listPrint() ;
    
    PSJF psjf = new PSJF( sortList ) ;
    psjf.run();
    psjf.CPU_listPrint() ;
    
    NPSJF npsjf = new NPSJF( sortList ) ;
    npsjf.run();
    npsjf.CPU_listPrint() ;
    
    Priority priority = new Priority( sortList ) ;
    priority.run();
    priority.CPU_listPrint() ;
    
    
    
    Sort_ID( 0 ,sortList.size()-1 ) ;
    G.Println( "===========================================================" ) ;
    G.Println( "\nWaiting Time" ) ;
    G.Println( "ID      FCFS    RR      PSJF    NPSJF   Priority" ) ;
    G.Println( "===========================================================" ) ;
    
    G.fPrintln( "===========================================================" ) ;
    G.fPrintln( "\r\nWaiting Time" ) ;
    G.fPrintln( "ID      FCFS    RR      PSJF    NPSJF   Priority" ) ;
    G.fPrintln( "===========================================================" ) ;
    
    for ( int i = 0 ; i < sortList.size() ; i ++ ) {
      Process1.StdPrint( sortList.get(i).mID , 
                         fcfs.mSortList.get(i).mTurnarround_Time - fcfs.mSortList.get(i).mCPU_Burst,
                         rr.mSortList.get(i).mTurnarround_Time - rr.mSortList.get(i).mCPU_Burst,
                         psjf.mSortList.get(i).mTurnarround_Time - psjf.mSortList.get(i).mCPU_Burst,
                         npsjf.mSortList.get(i).mTurnarround_Time - npsjf.mSortList.get(i).mCPU_Burst,
                         priority.mSortList.get(i).mTurnarround_Time - priority.mSortList.get(i).mCPU_Burst ) ;
    } // for
    G.Println( "===========================================================\n" ) ;
    G.Println( "Turnarround Time" ) ;
    G.Println( "ID      FCFS    RR      PSJF    NPSJF   Priority" ) ;
    G.Println( "===========================================================" ) ;
    G.fPrintln( "===========================================================\r\n" ) ;
    G.fPrintln( "Turnarround Time" ) ;
    G.fPrintln( "ID      FCFS    RR      PSJF    NPSJF   Priority" ) ;
    G.fPrintln( "===========================================================" ) ;
    for ( int i = 0 ; i < sortList.size() ; i ++ ) {
      Process1.StdPrint( sortList.get(i).mID , fcfs.mSortList.get(i).mTurnarround_Time,
                                               rr.mSortList.get(i).mTurnarround_Time,
                                               psjf.mSortList.get(i).mTurnarround_Time,
                                               npsjf.mSortList.get(i).mTurnarround_Time,
                                               priority.mSortList.get(i).mTurnarround_Time ) ;
    } // for
    G.Println( "===========================================================" ) ;
    G.fPrintln( "===========================================================" ) ;
    // G.Println( "==============="  ) ;
    // ListPrint( sortList ) ;
    
    // G.Println( Process1.GetPID( 10 ) ) ;
    G.WriteToFile();
    
  } // main()
  
  
  
} // class Main