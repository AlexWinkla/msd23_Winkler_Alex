# How To use GitHub

## Initialize Git

* before starting with git you should first set some Settings once:
```bash
> git config --global user.name <Global username>
> git config --global user.email <Global email>
```

---
* Settings witch should be done everytime a git gets created

```bash
> git init 
> git config --global init.globalBranch main
> git config --global pull.ff true
```
* ``globalBranch main`` is used to change the branch-name from master 
to main
* ``puff.ff true`` is used for git pull command

---
## Upload Files

To upload Files it is important to first ``add`` the file (local), 
then ``commit`` the file (local) with a message and last ``push`` the 
file to the server. It is notably that the message is shown to everybody, 
so the command should be clear and understandable.

* git add 
* git commit -m ``<message>``
* git push

---
## Download Files

Downloading files is down by pulling the files, but you could also you 
``git clone``. By ``git fetch`` the file only gets send back to the 
storage.

* git clone
* git pull
* git fetch
---
## Check Git

It is really important to check the status, only then you can see, what's 
going on. If you type ``git status`` you even can see what you should do 
next, very useful. To check what is updated on git, just use ``git diff``.
Another useful command is ``git log``, where you can see, which changes 
are done on git and also the commit messages are shown. By using 
``git log pretty=online`` the output is more readable.

* git status
* git diff
* git log

---
## Git Files

There are two important git files you should know about:

| File/Folder | Description                     |
|-------------|---------------------------------|
| .git        | Folder for git settings         |
| .gitignore  | Blank File to exclude filetypes |

The folder ``.git`` is automatically created, and it contains setting 
such as username and so on. If you don't know anything about it, don't change 
it, or even don't touch it.

``.gitignore`` is a blank file, which contains specific filetypes or names, 
which should be ignored by git, and not automatically created. For example, 
you create a blank git ignore file, and write ``*.html`` in it. So now all
html files are ignored by git.


