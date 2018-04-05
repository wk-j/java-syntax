#addin "wk.StartProcess"

using PS = StartProcess.Processor;

Task("Test").Does(() => {
    PS.StartProcess("mvn clean test");
});

var target = Argument("target", "Test");
RunTarget(target);