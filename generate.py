for i in range(11):
    f=open(f'BT_{i+11}.java','w')
    lines=['import java.util.*;\n',f'public class BT_{i+11}\n','{\n   public static void main(String args[])\n    {\n','        \n    }\n}']
    f.writelines(lines)
    f.close()
