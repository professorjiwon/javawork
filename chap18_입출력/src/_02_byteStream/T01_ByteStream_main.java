package _02_byteStream;
/*
   스트림 : 프로그램상의 데이터를 외부매체로 출력이나 입력을 하기 위해
   		   반드시 외부매체와 통로를 만들어야 됨. 이게 바로 스트림
   * 스트림(통로)의 특징
     - 단방향 : 입력이면 입력만. 출력이 출력만 가능
          => 입력과 출력을 동시에 하려면  -> 입력용스트림/출력용스트림을 따로 열어야 됨
     - 선입선출(FIFO) : 통로가 파이프 같은 개념이기 때문에 먼저 보낸값이 먼저 나옴
     - 시간지연(delay)이라는 문제가 생길 수 있음
     
   * 스트림의 구분
     > 통로의 사이즈(1byte짜리 / 2byte짜리)
       - 바이트 스트림 : 1byte만 입출력 할 수 있는 사이즈 => 입력(InputStream)/출력(OutpurStream)
       - 문자 스트림 : 2byte도 입출력 할 수 있는 사이즈 => 입력(Reader) / 출력(Writer)
     > 외부매체와 직접 연결하는 유무
       - 기반 스트림 : 외부매체와 직접 연결되는 통로(필수) 
       - 보조 스트림 : 보조역할을 하는 통로(선택)
       				. 속도 증가 등 기타 유용한 기능을 제공
       				. 보조스트림만 단독사용 불가(기반 스트림이 있는 상태에서 사용해야 함)
 */
public class T01_ByteStream_main {

	public static void main(String[] args) {
		ByteStream bs = new ByteStream();
		bs.fileSave();
		bs.fileRead();
	}
}
