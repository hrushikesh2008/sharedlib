def call() {   

     def mavenCommand = 'mvn package -DskipTests=true'
	
	sh script: mavnCommand, returnStatus: true      
    
}
