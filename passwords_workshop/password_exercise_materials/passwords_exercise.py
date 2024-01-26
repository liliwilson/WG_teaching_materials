# Password exercise in Python by Lili Wilson for Wilstaetter Gymnasium, 25.01.2024

import hashlib

# Hashed passwords of the people in the exercises
password_hashes = {
    "Bob": "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8",
    "Jeremy": "1532e76dbe9d43d0dea98c331ca5ae8a65c5e8e8b99d3e2a42ae989356f6242a",
    "Olivia": "b4b619c0678def23b479283b0b5042c8f9736bf16d137bc349518aba30e34b6b",
    "Kelly": "3171d89ad00530ffa19a244f040e9401a657903cbbbca724996b90a56df2c189",
    "Kai": "8c3eab3a9d70f32824f03ccd2658d5e98ad97b3856a2ca5291cad70f3d4a4577",
    "Marissa": "403f9b0cae353aa6e0df37d8f0a3e31261072b2c5af892377441877dc142348a"
}

def check_all_answers():
    correct_answers = 0
    total_answers = 0

    for name, hashed in password_hashes.items():
        password = None

        if name == "Bob":
            password = crack_password_1()
        elif name == "Jeremy":
            password = crack_password_2()
        elif name == "Olivia":
            password = crack_password_3()
        elif name == "Kelly":
            password = crack_password_4()
        elif name == "Kai":
            password = crack_password_5()
        elif name == "Marissa":
            password = crack_password_6()

        if (password is not None and hash_pwd(password) == hashed):
            correct_answers += 1
            total_answers += 1
            print(f"\n{name}'s password... CRACKED! \"{password}\" is correct.\n")
        elif (password is not None):
            total_answers += 1
            print(f"\n{name}'s password... not cracked! \"{password}\" is incorrect.\n")
    
    print(f"\nNumber of correct answers: {correct_answers} out of {total_answers}\n\n")
  

# Hash a password using SHA256, a common hashing algorithm
# You don't need to fully understand this part, just know that you input a string password, and it returns a hashed version!
def hash_pwd(x):
    p = x.encode('ascii')
    return hashlib.sha256(p).digest().hex()

def crack_password_1():
    # use this space for any coding you do to find the password
    password1 = None # replace this with the string that you think is the password! 
    return password1

def crack_password_2():
    # use this space for any coding you do to find the password
    password2 = None # replace this with the string that you think is the password!
    return password2

def crack_password_3():
    # use this space for any coding you do to find the password
    password3 = None # replace this with the string that you think is the password!
    return password3

def crack_password_4():
    # use this space for any coding you do to find the password
    password4 = None # replace this with the string that you think is the password!
    return password4

def crack_password_5():
    # use this space for any coding you do to find the password
    password5 = None # replace this with the string that you think is the password!
    return password5

def crack_password_6():
    # use this space for any coding you do to find the password
    password6 = None # replace this with the string that you think is the password!
    return password6



if __name__ == "__main__":
    check_all_answers()

