package com.xclink.ch06.exam;


public class Computer {
	
	public int maxCount;  //最多接入的设备数量
	private Device[] device = null; //设备数组
	private int realCount; //目前设备的实际数量
	
	//最大支持的设备数量
	public Computer(int maxCount){
		this.realCount = 0;
		this.maxCount = maxCount;
		device = new Device[maxCount];
	}
	
	/***
	 * 功能:
	 *    添加一台设备 
	 * @param device
	 * @return
	 */
	public boolean addDevice(Device dev){
		
		if(this.realCount<this.maxCount){
			this.realCount++;
			this.device[realCount] = dev;
			return true;
		}else{
			System.out.println("设备数量已达到最大数量"+this.maxCount);
			return false;
		}
		
	}
	
	
	public Device[] getAllDevices(){
		return this.device;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean removeDevice(int id){
		//首先校验 设备id是否在数组中存在
		boolean isExist = false;
		int pos = 0;//设备所在的位置编号
		for(int i=0;i<this.device.length;i++){
			if(this.device[i]!=null){
				if(this.device[i].getId()==id){
					isExist = true;
					pos = i;
				}
			}
		
		}
		
		//如果找到设备id
		if(isExist){
			//找到 ？？
			System.out.println("设备列表中存在设备id:"+id);
			for(int k=pos;k<this.realCount;k++){
				this.device[k] = this.device[k+1];
			}
			this.device[this.realCount] = null;
			this.realCount--;
			return true;
		}else{
			System.out.println("设备列表中没有ID为:"+id);
			return false;
		}
		
		
	}
	
	public void powerOn(){
		
		for(int i=0;i<this.device.length;i++){
			if(this.device[i]!=null){
				this.device[i].startup();
			}
		}
	}
	
	
	public void powerDown(){
		
		for(int i=0;i<this.device.length;i++){
			if(this.device[i]!=null){
				this.device[i].shutdown();;
			}
		}
	}

	public int getRealCount() {
		return realCount;
	}

	public void setRealCount(int realCount) {
		this.realCount = realCount;
	}

	
	public void dislaly() {
		
		for(int i=0;i<this.device.length;i++){
			
			if(this.device[i]!=null){
				
				if(this.device[i] instanceof OutputDevice){
					OutputDevice out = (OutputDevice) this.device[i];
					out.displayData("图片");
				}
				
			}
		}
	}
	
	
}
