Refer:
	https://qaautomation.expert/2023/08/16/selenium-grid-4-with-docker/


First Time:
	:->Git install
	:->Create GitHub account and repository

	Open Terminal (Git Bash)
	Go to workspace folder

	$ touch .gitignore

	Create a local repository (one time)
	$ git init

	Provide user credentials (one time)
	$ git config --global user.name  "Nadeem"
	$ git config --global user.email "go4nadeem@gmail.com"
	$ git config --list
	
	Shows untracked files
	$ git status

	Add files/folders to stagging/indexing
	$ git add -A
		$ git add <file_name>
		$ git add <folder_name>
	$ git add .
	$ git status
	$ git reset .
	$ git status	

	Commit the code into local (git) repository
	$ git commit -m "first commit message"
	$ git status

	Connect local repository to remote repository (one time)
	$ git remote add origin "https://github.com/pavanoltraining/OpencartV121.git"

	Push the code into GitHub repository
	$ git push origin master 
		Token: <genrated token>
		Steps to generate GitHub token
			Profile - Settings - Developer settings -> 
			Personal access tokens - Tokens (classic) -> 
			Generate new token - Generate new token (classic)
			Enter password: 
			Note: 
			Expiration: 
			Select (repo, admin, user, delete_repo)
			Generate token
			Copy the generated token

	Goto repository and check the updates

Second time onwards...
	Add a new/update any file
	$ git status
	$ git add .
	$ git status
	$ git commit -m "second commit message"
	$ git status
	$ git push origin master 
	$ git status
	
Third time - add files on git repo...
<>code 
	+ Create new file
	^ Upload files
	Commit message: uploading Notes.txt
	Commit changes...
	$ git pull "https://github.com/pavanoltraining/OpencartV121.git"

Fourth time - update Notes.txt file...
	$ git status
	$ git add .
	$ git status
	$ git commit -m "fourth commit message"
	$ git status
	$ git push origin master 
	$ git status

Clone new repository to local (Read only)
	$ git clone "https://github.com/pavanoltraining/OpencartV121.git"

1.Eclipse workspace
2.New repository on GitHub
$ git config --global user.name  "Nadeem"
$ git config --global user.email "go4nadeem@gmail.com"
$ git config --list
$ touch .gitignore (list file/folders to be ignored)
$ git init
$ git remote add origin https://github.com/OLC-NadeemShaikh/SWD_TestNG_Jenkins_Docker.git
3.git add .
$ git commit -m "fourth commit message"
$ git status
$ git push origin master 



…or create a new repository on the command line
echo "# SWD_TestNG_Jenkins_Docker" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/OLC-NadeemShaikh/SWD_TestNG_Jenkins_Docker.git
git push -u origin master

…or push an existing repository from the command line
git remote add origin https://github.com/OLC-NadeemShaikh/SWD_TestNG_Jenkins_Docker.git
git branch -M master
git push -u origin master


