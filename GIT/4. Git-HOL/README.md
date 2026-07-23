# Git Merge Conflict Resolution Lab

## Objectives

- Explain how to resolve merge conflicts in Git.
- Understand how conflicts occur when multiple users modify the same file.
- Learn to resolve conflicts using Git and P4Merge.

---

# Prerequisites

Before starting this lab, ensure you have:

- Completed **Git-T03-HOL_001 (Git Branching and Merging Lab)**
- Git installed
- Git Bash installed
- P4Merge configured as the default merge/diff tool
- A GitHub account (Do **not** use Cognizant credentials)

---


# Scenario

In this lab, the same file (`hello.xml`) will be modified differently in both the **GitWork** branch and the **master** branch. When merging, Git will detect conflicting changes and require manual conflict resolution.

---

# Step 1: Verify Master is Clean

Switch to the master branch.

```bash
git checkout master
```

Check the repository status.

```bash
git status
```

Expected Output:

```
On branch master
nothing to commit, working tree clean
```

---

# Step 2: Create a New Branch

Create a branch named **GitWork**.

```bash
git branch GitWork
```

Switch to the branch.

```bash
git checkout GitWork
```

---

# Step 3: Create hello.xml

Create a new file.

```bash
echo "<message>Hello from GitWork Branch</message>" > hello.xml
```

Check the repository status.

```bash
git status
```

---

# Step 4: Commit the Changes

Stage the file.

```bash
git add hello.xml
```

Commit the changes.

```bash
git commit -m "Added hello.xml in GitWork branch"
```

---

# Step 5: Switch Back to Master

```bash
git checkout master
```

---

# Step 6: Create hello.xml with Different Content

Create the same file with different content.

```bash
echo "<message>Hello from Master Branch</message>" > hello.xml
```

Stage the file.

```bash
git add hello.xml
```

Commit the changes.

```bash
git commit -m "Added hello.xml in master branch"
```

---

# Step 7: View Commit History

```bash
git log --oneline --graph --decorate --all
```

Example Output:

```
* a1b2c3d (HEAD -> master) Added hello.xml in master branch
| * e4f5g6h (GitWork) Added hello.xml in GitWork branch
|/
* x7y8z9 Initial Commit
```

---

# Step 8: Compare Differences

Display textual differences.

```bash
git diff master GitWork
```

---

# Step 9: View Differences Using P4Merge

```bash
git difftool master GitWork
```

P4Merge opens and visually displays the differences between both branches.

---

# Step 10: Merge GitWork into Master

```bash
git merge GitWork
```

Expected Output:

```
Auto-merging hello.xml
CONFLICT (add/add): Merge conflict in hello.xml
Automatic merge failed; fix conflicts and then commit the result.
```

---

# Step 11: Observe Conflict Markers

Open **hello.xml**.

Git inserts conflict markers like:

```xml
<<<<<<< HEAD
<message>Hello from Master Branch</message>
=======
<message>Hello from GitWork Branch</message>
>>>>>>> GitWork
```

These markers indicate:

- **HEAD** → Current (master) branch
- **GitWork** → Incoming branch

---

# Step 12: Resolve the Conflict Using P4Merge

Launch the merge tool.

```bash
git mergetool
```

P4Merge opens a **3-way merge** window.

Choose:

- Keep Master
- Keep GitWork
- Combine both changes

Example resolved file:

```xml
<message>Hello from Master Branch</message>
<message>Hello from GitWork Branch</message>
```

Save the file and close P4Merge.

---

# Step 13: Commit the Resolved Merge

Stage the resolved file.

```bash
git add hello.xml
```

Complete the merge.

```bash
git commit -m "Resolved merge conflict in hello.xml"
```

---

# Step 14: Check Repository Status

```bash
git status
```

Expected Output:

```
On branch master
nothing to commit, working tree clean
```

---

# Step 15: Ignore Backup Files

Create or update the `.gitignore` file.

```bash
echo "*.bak" >> .gitignore
```

Stage the file.

```bash
git add .gitignore
```

Commit the changes.

```bash
git commit -m "Added backup files to .gitignore"
```

---

# Step 16: List Available Branches

```bash
git branch
```

Expected Output:

```
GitWork
* master
```

---

# Step 17: Delete the Merged Branch

```bash
git branch -d GitWork
```

Expected Output:

```
Deleted branch GitWork.
```

---

# Step 18: View Final Commit History

```bash
git log --oneline --graph --decorate
```

Example Output:

```
* f9a8b7c (HEAD -> master) Added backup files to .gitignore
* d6e5f4a Resolved merge conflict in hello.xml
|\
| * e4f5g6h Added hello.xml in GitWork branch
* | a1b2c3d Added hello.xml in master branch
|/
* x7y8z9 Initial Commit
```

---

# Commands 

| Task | Command |
|------|----------|
| Check Status | `git status` |
| Create Branch | `git branch GitWork` |
| Switch Branch | `git checkout GitWork` |
| Create File | `echo "<message>Hello from GitWork Branch</message>" > hello.xml` |
| Add File | `git add hello.xml` |
| Commit Changes | `git commit -m "Added hello.xml in GitWork branch"` |
| Switch to Master | `git checkout master` |
| Create Same File | `echo "<message>Hello from Master Branch</message>" > hello.xml` |
| Commit | `git commit -m "Added hello.xml in master branch"` |
| View Logs | `git log --oneline --graph --decorate --all` |
| Compare Branches | `git diff master GitWork` |
| Visual Compare | `git difftool master GitWork` |
| Merge Branch | `git merge GitWork` |
| Launch Merge Tool | `git mergetool` |
| Stage Resolved File | `git add hello.xml` |
| Complete Merge | `git commit -m "Resolved merge conflict in hello.xml"` |
| Ignore Backup Files | `echo "*.bak" >> .gitignore` |
| Commit .gitignore | `git commit -m "Added backup files to .gitignore"` |
| List Branches | `git branch` |
| Delete Branch | `git branch -d GitWork` |
| View Final History | `git log --oneline --graph --decorate` |

---

# Result

- Creating separate branches.
- Modifying the same file in different branches.
- Producing a merge conflict.
- Resolving the conflict using Git and P4Merge.
- Completing the merge successfully.
- Updating the `.gitignore` file.
- Deleting the merged branch.
- Verifying the final commit history.

---

