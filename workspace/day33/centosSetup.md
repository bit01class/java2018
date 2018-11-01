
# 오라클 서버 셋팅

## 로그온 계정
id:root
pw:123456

## GUI환경만들기
1. ifup eth0 (인터넷 연결)
2. yum update (패키지 업데이트)
3. yum groupinstall "X Window System" "Desktop" "font" "Korean Support" 
4. reboot
5. startx

## 자바환경 셋팅
1. jdk 1.8 download
2. path 설정
	a. gedit .bash_profile
	```
	JAVA_HOME=/root/jdk1.8.~~~~
	PATH=$PATH:$JAVA_HOME/bin
	export PATH
	```
	b. source .bash_profile (or reboot)

## Oracle 셋업
1. download(https://goo.gl/FKkhc3)
2. yum install libaio bc flex (의존 패키지 인스톨)
3. yum install unzip
4. unzip -q oracle-xe~~~~~(파일명)
5. swap확보(가상메모리 증량)
	- dd if=/dev/zero of=/root/swapfile bs=2048000
	- mkswap /root/swapfile
	- swapon /root/swapfile
6. rpm -ivh oracle-~~~~
7. /etc/init.d/oracle-xe configure(오라클환경설정)
8. http port : 9090
9. listener port : 1521
10. pw:oracle
11. . /u01 /app /oracle /product /11.2.0 /xe /bin /oracle_env.sh
12. 









> Written with [bit01class](https://bit01class.github.io/).
