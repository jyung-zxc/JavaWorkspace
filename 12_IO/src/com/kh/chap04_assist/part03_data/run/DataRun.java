package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {
	public static void main(String[] args) {
		DataRun dr = new DataRun();
		dr.fileSave();
		dr.fileRead();
	}
	
	public void fileSave() {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"));){
			// 자바의 자료형별 데이터 작성
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('김');
			dos.writeUTF("자바자바");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"));){
			
			// 저장한 자료형 순서대로 읽어오기
			System.out.println(dis.readBoolean()
					+"\n"+dis.readInt()
					+"\n"+dis.readDouble()
					+"\n"+dis.readChar()
					+"\n"+dis.readUTF());
			System.out.println(dis.readUTF()); //EOF
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e){
			System.out.println("더이상 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
