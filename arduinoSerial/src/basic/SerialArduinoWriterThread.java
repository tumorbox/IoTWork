package basic;
//Ű����� �Է��ϴ� ���� �Ƶ��̳�� �������� ���� ������ - Serial

import java.io.IOException;
import java.io.OutputStream;

public class SerialArduinoWriterThread extends Thread{
	OutputStream out;
	public SerialArduinoWriterThread(OutputStream out) {
		super();
		this.out = out;
	}
	public void run() {
		int ledstate=0;
		try {
			while((ledstate=System.in.read())>-1) {
				out.write(ledstate);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
