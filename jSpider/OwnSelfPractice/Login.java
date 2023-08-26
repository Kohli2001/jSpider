public class Login {

        private String username;
        private String password;
    
        public Login(String username, String password) {
            this.username = username;
            this.password = password;
        }

    
        public boolean validate(String inputUsername, String inputPassword) {
            return username.equals(inputUsername) && password.equals(inputPassword);
        }

        
    }
    

